package org.serenityos.gml.plugin.core.editor

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import org.serenityos.gml.plugin.core.editor.syntax.GMLSyntaxHighlighter
import javax.swing.Icon

class GMLColourSettingsPage : ColorSettingsPage {

    companion object {
        @JvmStatic val DESCRIPTORS = arrayOf<AttributesDescriptor> (
            AttributesDescriptor("Separator", GMLSyntaxHighlighter.SEPARATOR),
            AttributesDescriptor("Number", GMLSyntaxHighlighter.NUMBER),
            AttributesDescriptor("String", GMLSyntaxHighlighter.STRING),
            AttributesDescriptor("Name", GMLSyntaxHighlighter.NAME),
            AttributesDescriptor("True", GMLSyntaxHighlighter.TRUE),
            AttributesDescriptor("False", GMLSyntaxHighlighter.FALSE),
            AttributesDescriptor("Class Prefix", GMLSyntaxHighlighter.CLASS_PREFIX),
            AttributesDescriptor("Class Name", GMLSyntaxHighlighter.CLASS_NAME),
            AttributesDescriptor("Colon", GMLSyntaxHighlighter.COLON)
        )
    }

    /**
     * Returns the list of descriptors specifying the [TextAttributesKey] instances
     * for which colors are specified in the page. For such attribute keys, the user can choose
     * all highlighting attributes (font type, background color, foreground color, error stripe color and
     * effects).
     *
     * @return the list of attribute descriptors.
     */
    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    /**
     * Returns the list of descriptors specifying the [com.intellij.openapi.editor.colors.ColorKey]
     * instances for which colors are specified in the page. For such color keys, the user can
     * choose only the background or foreground color.
     *
     * @return the list of color descriptors.
     */
    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    /**
     * Returns the title of the page, shown as text in the dialog tab.
     *
     * @return the title of the custom page.
     */
    override fun getDisplayName(): String {
        return "Serenity OS GML"
    }

    /**
     * Returns the icon for the page, shown in the dialog tab.
     *
     * @return the icon for the page, or null if the page does not have a custom icon.
     */
    override fun getIcon(): Icon? {
        return GMLIcons.FILE
    }

    /**
     * Returns the syntax highlighter which is used to highlight the text shown in the preview
     * pane of the page.
     *
     * @return the syntax highlighter instance.
     */
    override fun getHighlighter(): SyntaxHighlighter {
        return GMLSyntaxHighlighter()
    }

    /**
     * Returns the text shown in the preview pane. If some elements need to be highlighted in
     * the preview text which are not highlighted by the syntax highlighter, they need to be
     * surrounded by XML-like tags, for example: `<class>MyClass</class>`.
     * The mapping between the names of the tags and the text attribute keys used for highlighting
     * is defined by the [.getAdditionalHighlightingTagToDescriptorMap] method.
     *
     * @return the text to show in the preview pane or empty text to hide it.
     */
    override fun getDemoText(): String {
        return ""
    }

    /**
     * Returns the mapping from special tag names surrounding the regions to be highlighted
     * in the preview text (see [.getDemoText]) to text attribute keys used to
     * highlight the regions.
     *
     * @return the mapping from tag names to text attribute keys, or null if the demo text
     * does not contain any additional highlighting tags.
     */
    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? {
        return null
    }
}