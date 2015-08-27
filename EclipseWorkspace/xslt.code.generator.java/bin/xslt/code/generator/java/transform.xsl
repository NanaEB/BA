<xsl:stylesheet version='1.0'
	xmlns:xsl='http://www.w3.org/1999/XSL/Transform' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'
	xmlns:fsm='http://www.kermeta.org/fsm'>

	<xsl:template match="fsm:FSM">
		<xsl:text disable-output-escaping="yes">
		<xsl:function name="x:factorial">
   sssssssssssssssssssssss
</xsl:function>
#define FSM_DEBUG      
#include &lt;stdio.h&gt;
#include &lt;string.h&gt;
#include &lt;omnetpp.h&gt;
		</xsl:text>
		
class FSM: public cSimpleModule{
	cFSM fsm;
	enum {	
			INIT = 0,
			<xsl:for-each  select="state[@xsi:type='fsm:SteadyState']">
			<xsl:value-of select="@name"/> = FSM_Steady(<xsl:value-of select="position()"/>),
			</xsl:for-each>
			<xsl:for-each  select="state[@xsi:type='fsm:TransientState']">
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
	
<!--_______________________________________________________________________________________________-->
	<xsl:template match="intialState">
		case FSM_Exit(INIT):
	<xsl:for-each select="outTrans">
	<!-- fuer jede transition, eine if anweisung mit dem guard-action und target state ausgeben! -->
			 if(<xsl:value-of select="@guard"/>){
			 	<xsl:value-of select="@action"/>;
			 	
			 	<xsl:variable name="tmpNameOfState" select='substring-after(@target, "&apos;")' /> <xsl:variable name="nameOfState" select='substring-before($tmpNameOfState, "&apos;")' />
		 	 	FSM_Goto(fsm, <xsl:value-of select="$nameOfState"/>);
		 	 	 <xsl:value-of select="x:factorial"/>
		 	 }</xsl:for-each>
	<!--<xsl:template match="outTrans">
	<xsl:value-of select="@target"/>
	
		<xsl:template match="/fsm:FSM/intialState[outTrans/@guard]">
  		if(<xsl:value-of select="@guard"/>){rrrrrrrrrrrrrrrrr
 		</xsl:template>
 		</xsl:template>-->
 		
	
	<!--<xsl:value-of select="outTrans">
		 if(<xsl:value-of select="@input"/>){
			<xsl:value-of select="@output"/>;<xsl:variable name="tmpNameOfState" select='substring-after(@target, "&apos;")' /> <xsl:variable name="nameOfState" select='substring-before($tmpNameOfState, "&apos;")' />
		 	 FSM_Goto(fsm, <xsl:value-of select="$nameOfState"/>);
		  }</xsl:for-each>_-->
		 break;
	</xsl:template>
<!--_______________________________________________________________________________________________
	<xsl:template match="state">
	
		<xsl:choose>
			<xsl:when test="@xsi:type = 'fsm:InitialState'">
		case FSM_Exit(<xsl:value-of select="@name" />):<xsl:for-each select="outTrans">
			 if(<xsl:value-of select="@input"/>){
			 	<xsl:value-of select="@output"/>;<xsl:variable name="tmpNameOfState" select='substring-after(@target, "&apos;")' /> <xsl:variable name="nameOfState" select='substring-before($tmpNameOfState, "&apos;")' />
		 	 	FSM_Goto(fsm, <xsl:value-of select="$nameOfState"/>);
		 	 }</xsl:for-each>
			 break;
		
			</xsl:when>
			<xsl:otherwise>
		case FSM_Enter(<xsl:value-of select="@name" />):
			 break;
			 
		
		case FSM_Exit(<xsl:value-of select="@name" />):<xsl:for-each select="outTrans">
			 if(<xsl:value-of select="@input"/>){
		  		<xsl:value-of select="@output"/>;<xsl:variable name="tmpNameOfState" select='substring-after(@target, "&apos;")' /> <xsl:variable name="nameOfState" select='substring-before($tmpNameOfState, "&apos;")' />
				FSM_Goto(fsm, <xsl:value-of select="$nameOfState"/>);
			 }</xsl:for-each>
			 break;
			 
			</xsl:otherwise>
		</xsl:choose>
</xsl:template>

-->


<!--_______________________________________________________________________________________________
<xsl:template match="outTrans">

<xsl:value-of select="@target"/>


</xsl:template>-->


</xsl:stylesheet>


<!-- <xsl:template match="states"> public class <xsl:value-of select="@name"/>{} 
	<xsl:apply-templates select="outTrans" /> </xsl:template> <xsl:template match="outTrans"> 
	lala <xsl:value-of select="@input"/> </xsl:template> -->

