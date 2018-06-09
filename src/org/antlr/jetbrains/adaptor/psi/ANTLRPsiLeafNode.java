package org.antlr.jetbrains.adaptor.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.tree.IElementType;
import org.antlr.jetbrains.adaptor.SymtabUtils;

/** A leaf node you can use as a superclass for your PSI trees.
 *  You don't have to use it of course, but it gives you basic
 *  simple scoping behavior via getContext().
 *
 *  I recommends creating a subclass for identifiers, such as
 *  MyLanguageIDNode. To enable rename, find usages, etc... that
 *  node will need to implement PsiNamedElement.
 */
public class ANTLRPsiLeafNode extends LeafPsiElement {

	public ANTLRPsiLeafNode(IElementType type, CharSequence text) {
		super(type, text);
	}

}
