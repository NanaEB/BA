<xsl:stylesheet version='1.0'
	xmlns:xsl='http://www.w3.org/1999/XSL/Transform' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'
	xmlns:fsm='http://www.kermeta.org/fsm' xmlns:xmi='http://www.omg.org/XMI'>
<!--_______________________________________REMOVE_FIRST_LINE_______________________________________-->
<xsl:output method="xml" indent="yes" omit-xml-declaration="yes" />

<xsl:key name="target" match="state" use="@xmi:id"/>
<!--_______________________________________REMOVING LINE-BREAKS________________________________-->
<xsl:template match="*/text()[normalize-space()]">
    <xsl:value-of select="normalize-space()"/>
</xsl:template>

<xsl:template match="*/text()[not(normalize-space())]" />
<!--_______________________________________ROOT_TEMPLATE_______________________________________-->

	<xsl:template match="fsm:FSM">
		<xsl:text disable-output-escaping="yes">
#define FSM_DEBUG      
#include &lt;stdio.h&gt;
#include &lt;string.h&gt;
#include &lt;omnetpp.h&gt;
		</xsl:text>
		
class FSM: public cSimpleModule{
	cFSM fsm;
	enum {	
			INIT = 0,
			<xsl:for-each  select="state[@xmi:type='fsm:SteadyState']">
			<xsl:value-of select="@name"/> = FSM_Steady(<xsl:value-of select="position()"/>),
			</xsl:for-each>
			<xsl:for-each  select="state[@xmi:type='fsm:TransientState']">
			<xsl:value-of select="@name"/> = FSM_Transient(<xsl:value-of select="position()"/>),
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
	

<!--_______________________________________INITIALSTATE_TEMPLATE_______________________________________-->
	<xsl:template match="intialState">               
			case FSM_Exit(INIT):   
								<xsl:call-template name="printExitCaseBody"/>	
	</xsl:template>

<!--_______________________________________STATE_TEMPLATE_______________________________________-->
	<xsl:template match="state">		
								<xsl:call-template name="printEnterCase"/>
								<xsl:call-template name="printExitCaseHead"/>
								<xsl:call-template name="printExitCode"/>
								<xsl:call-template name="printExitCaseBody"/>		
	</xsl:template>










<!--_______________________________________Methoden_______________________________________-->


<xsl:template name="getStateName">
	<xsl:variable name="tmpNameOfState" select='substring-after(@target, "&apos;")' />
	<xsl:variable name="nameOfState" select='substring-before($tmpNameOfState, "&apos;")' />
 	<xsl:value-of select="$nameOfState"/>
</xsl:template>
	
<!--______________________________________________________________________________-->

<xsl:template name="printExitCaseBody"><xsl:for-each select="outTrans">  <xsl:if test="string-length(@Guard) != 0">				
								if(<xsl:value-of select="@Guard"/>){</xsl:if>
									  <xsl:if test="string-length(@Effect) != 0"> <!-- falls effect vorhanden .. ausgeben-->
								  //effect
								  <xsl:value-of select="@Effect"/>;</xsl:if>
								  FSM_Goto(fsm, <xsl:for-each select="key('target',@target)">
  									 <xsl:value-of select="@name"/>
  										</xsl:for-each>);
								<xsl:if test="string-length(@Guard) != 0">}</xsl:if>	<!-- if Anweisung schließen -->
								</xsl:for-each>
								break;
</xsl:template>
	
<!--______________________________________________________________________________-->

<xsl:template name="printExitCaseHead">
			case FSM_Exit(<xsl:value-of select="@name"/>):</xsl:template>

<!--______________________________________________________________________________-->

<xsl:template name="printEnterCase">
			case FSM_Enter(<xsl:value-of select="@name"/>):
			<xsl:choose>
   			<xsl:when test="entry/@entryLabel != ''">
   								//entry code
    		  					<xsl:value-of select="entry/@entryLabel"/>;</xsl:when>
			</xsl:choose>   
								break; 
</xsl:template>

<!--______________________________________________________________________________-->

<xsl:template name="printExitCode"> 
 <xsl:if test="string-length(exit/@exitLabel) != 0">
 								//exit code
								<xsl:value-of select="exit/@exitLabel"/>;
</xsl:if>
</xsl:template>







</xsl:stylesheet>

<!-- <xsl:template match="states"> public class <xsl:value-of select="@name"/>{} 
	<xsl:apply-templates select="outTrans" /> </xsl:template> <xsl:template match="outTrans"> 
	lala <xsl:value-of select="@input"/> </xsl:template> -->

