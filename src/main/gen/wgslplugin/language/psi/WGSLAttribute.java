// This is a generated file. Not intended for manual editing.
package wgslplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WGSLAttribute extends PsiElement {

  @NotNull
  WGSLAttributeName getAttributeName();

  @NotNull
  List<WGSLLiteralOrIdent> getLiteralOrIdentList();

}
