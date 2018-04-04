package jetbrains.mps.samples.VoiceMenu.editor;

/*Generated by MPS */

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.baseLanguage.logging.runtime.model.LoggingRuntime;
import org.apache.log4j.Level;
import java.util.Objects;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.editor.runtime.cells.CellIdManager;

public class ActivityPlayback {
  private static final Logger LOG = LogManager.getLogger(ActivityPlayback.class);
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.CLICK, new ActivityPlayback.ActivityPlayback_CLICK(node));
  }
  public static class ActivityPlayback_CLICK extends AbstractCellAction {
    /*package*/ SNode myNode;
    public ActivityPlayback_CLICK(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      LoggingRuntime.logMsgView(Level.INFO, "Clicked", ActivityPlayback.class, null, null);
      if (Objects.equals(SPropertyOperations.getString(node, MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x25806c66fbe600f7L, "playback")), "Choose from..")) {
        SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x25806c66fbe600f7L, "playback"), " ");
        SelectionUtil.selectNode(editorContext, node);
        SelectionUtil.selectCell(editorContext, node, "*" + CellIdManager.createPropertyId("playback"));
      }
    }
  }
}
