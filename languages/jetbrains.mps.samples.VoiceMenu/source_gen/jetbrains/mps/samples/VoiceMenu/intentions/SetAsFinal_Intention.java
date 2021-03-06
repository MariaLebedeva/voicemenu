package jetbrains.mps.samples.VoiceMenu.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.openapi.intentions.IntentionExecutable;
import jetbrains.mps.openapi.intentions.Kind;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.Collections;
import jetbrains.mps.intentions.AbstractIntentionExecutable;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;

public final class SetAsFinal_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public SetAsFinal_Intention() {
    super(Kind.NORMAL, false, new SNodePointer("r:d92c1500-00d3-4072-866a-5077893293b8(jetbrains.mps.samples.VoiceMenu.intentions)", "5461963470560281125"));
  }
  @Override
  public String getPresentation() {
    return "SetAsFinal";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }
  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    boolean flag = false;
    if (SNodeOperations.isInstanceOf(node, CONCEPTS.DirectCall$7C)) {
      SNode myNode = SNodeOperations.cast(node, CONCEPTS.DirectCall$7C);
      flag = !(SPropertyOperations.getBoolean(myNode, PROPS.isFinal$sgnO));
    }
    if (SNodeOperations.isInstanceOf(node, CONCEPTS.Other$87)) {
      SNode myNode = SNodeOperations.cast(node, CONCEPTS.Other$87);
      flag = !(SPropertyOperations.getBoolean(myNode, PROPS.isFinal$swjV));
    }
    if (SNodeOperations.isInstanceOf(node, CONCEPTS.Record$69)) {
      SNode myNode = SNodeOperations.cast(node, CONCEPTS.Record$69);
      flag = !(SPropertyOperations.getBoolean(myNode, PROPS.isFinal$DiZZ));
    }
    if (SNodeOperations.isInstanceOf(node, CONCEPTS.GetInfo$95)) {
      SNode myNode = SNodeOperations.cast(node, CONCEPTS.GetInfo$95);
      flag = !(SPropertyOperations.getBoolean(myNode, PROPS.isFinal$sihs));
    }
    return flag;
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Set as Final";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      if (SNodeOperations.isInstanceOf(node, CONCEPTS.DirectCall$7C)) {
        SNode myNode = SNodeOperations.cast(node, CONCEPTS.DirectCall$7C);
        SPropertyOperations.assign(myNode, PROPS.isFinal$sgnO, true);
      }
      if (SNodeOperations.isInstanceOf(node, CONCEPTS.Other$87)) {
        SNode myNode = SNodeOperations.cast(node, CONCEPTS.Other$87);
        SPropertyOperations.assign(myNode, PROPS.isFinal$swjV, true);
      }
      if (SNodeOperations.isInstanceOf(node, CONCEPTS.Record$69)) {
        SNode myNode = SNodeOperations.cast(node, CONCEPTS.Record$69);
        SPropertyOperations.assign(myNode, PROPS.isFinal$DiZZ, true);
      }
      if (SNodeOperations.isInstanceOf(node, CONCEPTS.GetInfo$95)) {
        SNode myNode = SNodeOperations.cast(node, CONCEPTS.GetInfo$95);
        SPropertyOperations.assign(myNode, PROPS.isFinal$sihs, true);
      }


    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return SetAsFinal_Intention.this;
    }
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept DirectCall$7C = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980ac8L, "jetbrains.mps.samples.VoiceMenu.structure.DirectCall");
    /*package*/ static final SConcept Other$87 = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980ac9L, "jetbrains.mps.samples.VoiceMenu.structure.Other");
    /*package*/ static final SConcept Record$69 = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x420d89797f0d16f6L, "jetbrains.mps.samples.VoiceMenu.structure.Record");
    /*package*/ static final SConcept GetInfo$95 = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980acbL, "jetbrains.mps.samples.VoiceMenu.structure.GetInfo");
  }

  private static final class PROPS {
    /*package*/ static final SProperty isFinal$sgnO = MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980ac8L, 0x420d89797f56bce4L, "isFinal");
    /*package*/ static final SProperty isFinal$swjV = MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980ac9L, 0x420d89797f56bde6L, "isFinal");
    /*package*/ static final SProperty isFinal$DiZZ = MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x420d89797f0d16f6L, 0x420d89797f56bd93L, "isFinal");
    /*package*/ static final SProperty isFinal$sihs = MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980acbL, 0x420d89797f56bd37L, "isFinal");
  }
}
