<xsl:stylesheet version = '1.0'
     xmlns:xsl='http://www.w3.org/1999/XSL/Transform'>

<xsl:template  match="/source">
	public class <xsl:value-of select="classname"/>{
}
</xsl:template>

</xsl:stylesheet> 