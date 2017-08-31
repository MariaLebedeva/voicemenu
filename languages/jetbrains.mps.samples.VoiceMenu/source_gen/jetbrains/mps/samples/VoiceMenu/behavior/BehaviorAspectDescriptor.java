package jetbrains.mps.samples.VoiceMenu.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBehaviorAspectDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.BHDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public final class BehaviorAspectDescriptor extends BaseBehaviorAspectDescriptor {
  private final BHDescriptor myMenu__BehaviorDescriptor = new Menu__BehaviorDescriptor();
  private final BHDescriptor myActivity__BehaviorDescriptor = new Activity__BehaviorDescriptor();
  private final BHDescriptor myDirectCall__BehaviorDescriptor = new DirectCall__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt_a0g = concept;
    switch (index_846f5o_a0g.index(cncpt_a0g)) {
      case 0:
        return myActivity__BehaviorDescriptor;
      case 1:
        return myDirectCall__BehaviorDescriptor;
      case 2:
        return myMenu__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex index_846f5o_a0g = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL), MetaIdFactory.conceptId(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5dfe7d1339980ac8L), MetaIdFactory.conceptId(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L)).seal();
}
