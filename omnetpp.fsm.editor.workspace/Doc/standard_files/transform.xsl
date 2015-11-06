<xsl:stylesheet version='1.0'
	xmlns:xsl='http://www.w3.org/1999/XSL/Transform' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'
	xmlns:fsm='http://www.kermeta.org/fsm' xmlns:xmi='http://www.omg.org/XMI'>

<xsl:output method="xml" indent="yes" omit-xml-declaration="yes" /> 								<!-- remove xml declaration -->
<xsl:key name="target" match="state" use="@xmi:id"/> 												<!-- declaration of the key "target" to get a state with a given xmi:id -->


<!-- remove line-breaks -->
<xsl:template match="*/text()[normalize-space()]">
    <xsl:value-of select="normalize-space()"/>
</xsl:template> <xsl:template match="*/text()[not(normalize-space())]" />


<!--_______________________________________fsm:FSM_template(root)_______________________________________-->
	<xsl:template match="fsm:FSM">
		<xsl:text disable-output-escaping="yes"> 													<!-- used to write literal text to the output -->
#define FSM_DEBUG      
#include &lt;stdio.h&gt;
#include &lt;string.h&gt;
#include &lt;omnetpp.h&gt;
		</xsl:text>
		
class FSM: public cSimpleModule{
	cFSM fsm;
	enum {	
			INIT = 0,
			//Zustandsname = FSM_Typ(Position)
			<xsl:for-each  select="state[@xmi:type='fsm:SteadyState']"> 							<!-- for each steady state -->
			<xsl:value-of select="@name"/> = FSM_Steady(<xsl:value-of select="position()"/>),		<!-- get the name and it's tree-position -->
			</xsl:for-each>
			<xsl:for-each  select="state[@xmi:type='fsm:TransientState']">							<!-- for each transient state -->
			<xsl:value-of select="@name"/> = FSM_Transient(<xsl:value-of select="position()"/>),	<!-- get the name and it's tree-position -->
			</xsl:for-each>
 		 };

public:
    FSM();
    virtual ~FSM();

protected:
    virtual void initialize();
    virtual void handleMessage(cMessage *msg);
};

Define_Module(FSM);

FSM::FSM() {}

FSM::~FSM() {}

void Tic::initialize() {

    fsm.setName("fsm");

}


void FSM::handleMessage(cMessage *msg) {

	FSM_Switch(fsm){
		<xsl:apply-templates select="intialState" />
		<xsl:apply-templates select="state" />
		  
	}
}		
		
	</xsl:template>
	
<!--_______________________________________state_template_______________________________________-->
	<xsl:template match="state">		
								
								<xsl:call-template name="generateEnterCase"/>
								
								<xsl:call-template name="generateHeadOfExitCase"/>
								<xsl:call-template name="generateExitCode"/>
								<xsl:call-template name="generateBodyOfExitCaseTest"/>		
	</xsl:template>
	
<!--_______________________________________initialState_template_______________________________________-->
	<xsl:template match="intialState">               
	case FSM_Exit(INIT):   
		<xsl:call-template name="generateBodyOfExitCaseTest"/>	
	</xsl:template>











<!--_______________________________________methods_______________________________________-->


<!-- generate the enter case of the current state ____________________________________________________________________-->
<xsl:template name="generateEnterCase">

	<xsl:choose>
		<!-- if state == steady state -->	
   		<xsl:when test="@xmi:type='fsm:SteadyState'">			
	case FSM_Enter(<xsl:value-of select="@name"/>):
		<xsl:choose>
			<xsl:when test="entry/@entryLabel != ''">
   		//entry code
		<xsl:variable name="enterLabelString" select='entry/@entryLabel' />
		<xsl:call-template name="string-replace-all">
		<xsl:with-param name="text" select="$enterLabelString"/>
		<xsl:with-param name="replace" select="';'"/>
		<xsl:with-param name="by" select="';&#10;      	'"/>
		</xsl:call-template></xsl:when>
		</xsl:choose>   
		break; 
		</xsl:when>
		<!-- if state == transient state -->
		<xsl:otherwise>
			<xsl:choose>
				<xsl:when test="entry/@entryLabel != ''">
    case FSM_Enter(<xsl:value-of select="@name"/>):
		//entry code
    	<xsl:value-of select="entry/@entryLabel" disable-output-escaping="yes"/>;
		break;
				</xsl:when>
			</xsl:choose> 
		</xsl:otherwise>
	</xsl:choose>  
</xsl:template>

<!-- get the name of the current state ______________________________________________________________________________-->
<xsl:template name="getStateName">
	<xsl:variable name="tmpNameOfState" select='substring-after(@target, "&apos;")' />
	<xsl:variable name="nameOfState" select='substring-before($tmpNameOfState, "&apos;")' />
 	<xsl:value-of select="$nameOfState"/>
</xsl:template>
	

	
<!-- generate only the head of the exit-case for the currrent state __________________________________________________-->
<xsl:template name="generateHeadOfExitCase">
	case FSM_Exit(<xsl:value-of select="@name"/>):</xsl:template>



<xsl:template name="generateExitCode"> 
 <xsl:if test="string-length(exit/@exitLabel) != 0">
 		//exit code
		<xsl:variable name="exitLabelString" select='exit/@exitLabel' />
		<xsl:call-template name="string-replace-all">
			<xsl:with-param name="text" select="$exitLabelString"/>
			<xsl:with-param name="replace" select="';'"/>
			<xsl:with-param name="by" select="';&#10;      	'"/>
		</xsl:call-template>
		<!--<xsl:value-of select="$exitLabelString" disable-output-escaping="yes"/>;-->
</xsl:if>
</xsl:template>

<!-- generate the body the of exit-case for the current state _________________________________________________________-->
<xsl:template name="generateBodyOfExitCase">
<xsl:for-each select="outTrans">  <xsl:if test="string-length(@Guard) != 0">				
		if(<xsl:value-of select="@Guard" disable-output-escaping="yes"/>){</xsl:if>
		<xsl:if test="string-length(@Effect) != 0"> 					<!-- falls effect vorhanden .. ausgeben-->
		//effect
		<xsl:variable name="effectString" select='@Effect' />
		<xsl:call-template name="string-replace-all">
		<xsl:with-param name="text" select="$effectString"/>
		<xsl:with-param name="replace" select="';'"/>
		<xsl:with-param name="by" select="';&#10;       '"/>
		</xsl:call-template>
		<!-- <xsl:value-of select="@Effect" disable-output-escaping="yes"/>;-->
		</xsl:if>
		FSM_Goto(fsm, <xsl:for-each select="key('target',@target)"> 		<!-- get the state node with the given xmi:id -->
			<xsl:value-of select="@name"/> 									<!-- Name of the found state -->
					  </xsl:for-each>);
		<xsl:if test="string-length(@Guard) != 0">}</xsl:if>				<!-- if Anweisung schliessen -->
		</xsl:for-each>
		break;
</xsl:template>

<!-- generate the body the of exit-case for the current state _________________________________________________________-->
<xsl:template name="generateBodyOfExitCaseTest">
<xsl:for-each select="outTrans">  
	<xsl:choose>
        <xsl:when test="string-length(@Guard) != 0">				
		if(<xsl:value-of select="@Guard" disable-output-escaping="yes"/>){
			<xsl:if test="string-length(@Effect) != 0"> 					<!-- falls effect vorhanden .. ausgeben-->
		   //effect
		   <xsl:variable name="effectString" select='@Effect' />
		   <xsl:call-template name="string-replace-all">
		   <xsl:with-param name="text" select="$effectString"/>
		   <xsl:with-param name="replace" select="';'"/>
		   <xsl:with-param name="by" select="';&#10;          '"/>
		   </xsl:call-template>
			</xsl:if>
		   FSM_Goto(fsm, <xsl:for-each select="key('target',@target)"> 		<!-- get the state node with the given xmi:id -->
				<xsl:value-of select="@name"/> 									<!-- Name of the found state -->
					  </xsl:for-each>);
		<xsl:if test="string-length(@Guard) != 0">}</xsl:if>				<!-- if Anweisung schliessen -->
		</xsl:when>
		<xsl:otherwise>			
		<xsl:if test="string-length(@Effect) != 0"> 
		//effect
		<xsl:variable name="effectString" select='@Effect' />
		<xsl:call-template name="string-replace-all">
		<xsl:with-param name="text" select="$effectString"/>
		<xsl:with-param name="replace" select="';'"/>
		<xsl:with-param name="by" select="';&#10;       '"/>
		</xsl:call-template>
		</xsl:if>
		FSM_Goto(fsm, <xsl:for-each select="key('target',@target)"> 		<!-- get the state node with the given xmi:id -->
			<xsl:value-of select="@name"/> 									<!-- Name of the found state -->
					  </xsl:for-each>);   
        </xsl:otherwise>
		</xsl:choose>
	</xsl:for-each>
		break;
</xsl:template>

<!-- replace string with given string  ________________________________________________________________________________-->
<xsl:template name="string-replace-all">
    <xsl:param name="text" />
    <xsl:param name="replace" />
    <xsl:param name="by" />
    <xsl:choose>
        <xsl:when test="contains($text, $replace)">
            <xsl:value-of select="substring-before($text,$replace)" disable-output-escaping="yes"/>
            <xsl:value-of select="$by" disable-output-escaping="yes"/>
            <xsl:call-template name="string-replace-all">
                <xsl:with-param name="text" select="substring-after($text,$replace)" />
                <xsl:with-param name="replace" select="$replace" />
                <xsl:with-param name="by" select="$by" />
            </xsl:call-template>
        </xsl:when>
        <xsl:otherwise>
            <xsl:value-of select="$text" disable-output-escaping="yes"/>
        </xsl:otherwise>
    </xsl:choose>
</xsl:template>




</xsl:stylesheet>

<!-- <xsl:template match="states"> public class <xsl:value-of select="@name"/>{} 
	<xsl:apply-templates select="outTrans" /> </xsl:template> <xsl:template match="outTrans"> 
	lala <xsl:value-of select="@input"/> </xsl:template> -->

