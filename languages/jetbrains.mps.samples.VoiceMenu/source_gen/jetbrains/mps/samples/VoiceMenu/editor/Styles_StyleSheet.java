package jetbrains.mps.samples.VoiceMenu.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.editor.runtime.style.AbstractStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.editor.runtime.style.ShowBoundariesArea;
import jetbrains.mps.nodeEditor.EditorSettings;
import java.awt.Color;

public class Styles_StyleSheet {
  /**
   * 
   * @deprecated Since MPS 3.5 use generated StyleClass
   */
  @Deprecated
  public static void apply_Arrows(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    new Styles_StyleSheet.ArrowsStyleClass(editorContext, node).apply(style, editorCell);
  }
  /**
   * 
   * @deprecated Since MPS 3.5 use generated StyleClass
   */
  @Deprecated
  public static void apply_Action(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    new Styles_StyleSheet.ActionStyleClass(editorContext, node).apply(style, editorCell);
  }
  /**
   * 
   * @deprecated Since MPS 3.5 use generated StyleClass
   */
  @Deprecated
  public static void apply_HardCodedText(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    new Styles_StyleSheet.HardCodedTextStyleClass(editorContext, node).apply(style, editorCell);
  }
  /**
   * 
   * @deprecated Since MPS 3.5 use generated StyleClass
   */
  @Deprecated
  public static void apply_UserWrittenText(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    new Styles_StyleSheet.UserWrittenTextStyleClass(editorContext, node).apply(style, editorCell);
  }
  /**
   * 
   * @deprecated Since MPS 3.5 use generated StyleClass
   */
  @Deprecated
  public static void apply_Declarations(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    new Styles_StyleSheet.DeclarationsStyleClass(editorContext, node).apply(style, editorCell);
  }
  /**
   * 
   * @deprecated Since MPS 3.5 use generated StyleClass
   */
  @Deprecated
  public static void apply_EmptyCell(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    new Styles_StyleSheet.EmptyCellStyleClass(editorContext, node).apply(style, editorCell);
  }
  /**
   * 
   * @deprecated Since MPS 3.5 use generated StyleClass
   */
  @Deprecated
  public static void apply_Brackets(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    new Styles_StyleSheet.BracketsStyleClass(editorContext, node).apply(style, editorCell);
  }
  /**
   * 
   * @deprecated Since MPS 3.5 use generated StyleClass
   */
  @Deprecated
  public static void apply_Greeting(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    new Styles_StyleSheet.GreetingStyleClass(editorContext, node).apply(style, editorCell);
  }

  public static class ArrowsStyleClass extends AbstractStyleClass {
    public ArrowsStyleClass(EditorContext editorContext, SNode node) {
      super(editorContext, node);
    }

    @Override
    public void apply(Style style, EditorCell editorCell) {
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.black));
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
      style.set(StyleAttributes.SHOW_BOUNDARIES_IN, ShowBoundariesArea.GUTTER);
      style.set(StyleAttributes.FONT_SIZE, _StyleParameter_QueryFunction_kkd5s1_a3a());
    }

    private int _StyleParameter_QueryFunction_kkd5s1_a3a() {
      return (EditorSettings.getInstance().getFontSize() * 120 / 100);
    }
  }
  public static class ActionStyleClass extends AbstractStyleClass {
    public ActionStyleClass(EditorContext editorContext, SNode node) {
      super(editorContext, node);
    }

    @Override
    public void apply(Style style, EditorCell editorCell) {
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.black));
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
      style.set(StyleAttributes.SHOW_BOUNDARIES_IN, ShowBoundariesArea.GUTTER);
      style.set(StyleAttributes.FONT_SIZE, _StyleParameter_QueryFunction_kkd5s1_a3b());
    }

    private int _StyleParameter_QueryFunction_kkd5s1_a3b() {
      return (EditorSettings.getInstance().getFontSize() * 110 / 100);
    }
  }
  public static class HardCodedTextStyleClass extends AbstractStyleClass {
    public HardCodedTextStyleClass(EditorContext editorContext, SNode node) {
      super(editorContext, node);
    }

    @Override
    public void apply(Style style, EditorCell editorCell) {
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.darkGray));
      style.set(StyleAttributes.SHOW_BOUNDARIES_IN, ShowBoundariesArea.GUTTER);
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
      style.set(StyleAttributes.FONT_SIZE, _StyleParameter_QueryFunction_kkd5s1_a3c());
    }

    private int _StyleParameter_QueryFunction_kkd5s1_a3c() {
      return (EditorSettings.getInstance().getFontSize() * 120 / 100);
    }
  }
  public static class UserWrittenTextStyleClass extends AbstractStyleClass {
    public UserWrittenTextStyleClass(EditorContext editorContext, SNode node) {
      super(editorContext, node);
    }

    @Override
    public void apply(Style style, EditorCell editorCell) {
      style.set(StyleAttributes.SHOW_BOUNDARIES_IN, ShowBoundariesArea.GUTTER);
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.black));
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
      style.set(StyleAttributes.FONT_SIZE, _StyleParameter_QueryFunction_kkd5s1_a3d());
    }

    private int _StyleParameter_QueryFunction_kkd5s1_a3d() {
      return (EditorSettings.getInstance().getFontSize() * 140 / 100);
    }
  }
  public static class DeclarationsStyleClass extends AbstractStyleClass {
    public DeclarationsStyleClass(EditorContext editorContext, SNode node) {
      super(editorContext, node);
    }

    @Override
    public void apply(Style style, EditorCell editorCell) {
      style.set(StyleAttributes.SHOW_BOUNDARIES_IN, ShowBoundariesArea.GUTTER);
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
      style.set(StyleAttributes.FONT_SIZE, _StyleParameter_QueryFunction_kkd5s1_a2e());
    }

    private int _StyleParameter_QueryFunction_kkd5s1_a2e() {
      return (EditorSettings.getInstance().getFontSize() * 140 / 100);
    }
  }
  public static class EmptyCellStyleClass extends AbstractStyleClass {
    public EmptyCellStyleClass(EditorContext editorContext, SNode node) {
      super(editorContext, node);
    }

    @Override
    public void apply(Style style, EditorCell editorCell) {
      style.set(StyleAttributes.FONT_SIZE, _StyleParameter_QueryFunction_kkd5s1_a0f());
    }

    private int _StyleParameter_QueryFunction_kkd5s1_a0f() {
      return (EditorSettings.getInstance().getFontSize() * 120 / 100);
    }
  }
  public static class BracketsStyleClass extends AbstractStyleClass {
    public BracketsStyleClass(EditorContext editorContext, SNode node) {
      super(editorContext, node);
    }

    @Override
    public void apply(Style style, EditorCell editorCell) {
      style.set(StyleAttributes.SHOW_BOUNDARIES_IN, ShowBoundariesArea.GUTTER);
      style.set(StyleAttributes.FONT_SIZE, _StyleParameter_QueryFunction_kkd5s1_a1g());
    }

    private int _StyleParameter_QueryFunction_kkd5s1_a1g() {
      return (EditorSettings.getInstance().getFontSize() * 100 / 100);
    }
  }
  public static class GreetingStyleClass extends AbstractStyleClass {
    public GreetingStyleClass(EditorContext editorContext, SNode node) {
      super(editorContext, node);
    }

    @Override
    public void apply(Style style, EditorCell editorCell) {
      style.set(StyleAttributes.SHOW_BOUNDARIES_IN, ShowBoundariesArea.GUTTER);
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
      style.set(StyleAttributes.FONT_SIZE, _StyleParameter_QueryFunction_kkd5s1_a2h());
      style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(new Color(11514923)));
      style.set(StyleAttributes.NULL_TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.gray));
    }

    private int _StyleParameter_QueryFunction_kkd5s1_a2h() {
      return (EditorSettings.getInstance().getFontSize() * 110 / 100);
    }
  }
}
