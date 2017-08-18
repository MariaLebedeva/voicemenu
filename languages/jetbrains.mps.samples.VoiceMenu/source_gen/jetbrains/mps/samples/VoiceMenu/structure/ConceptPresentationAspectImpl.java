package jetbrains.mps.samples.VoiceMenu.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Action;
  private ConceptPresentation props_Activity;
  private ConceptPresentation props_Back;
  private ConceptPresentation props_Call;
  private ConceptPresentation props_Command;
  private ConceptPresentation props_Empty;
  private ConceptPresentation props_Event;
  private ConceptPresentation props_GetInfo;
  private ConceptPresentation props_Menu;
  private ConceptPresentation props_Other;
  private ConceptPresentation props_WorkSpace;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Action:
        if (props_Action == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Action = cpb.create();
        }
        return props_Action;
      case LanguageConceptSwitch.Activity:
        if (props_Activity == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("activity");
          props_Activity = cpb.create();
        }
        return props_Activity;
      case LanguageConceptSwitch.Back:
        if (props_Back == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Back");
          props_Back = cpb.create();
        }
        return props_Back;
      case LanguageConceptSwitch.Call:
        if (props_Call == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Direct call");
          props_Call = cpb.create();
        }
        return props_Call;
      case LanguageConceptSwitch.Command:
        if (props_Command == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Command = cpb.create();
        }
        return props_Command;
      case LanguageConceptSwitch.Empty:
        if (props_Empty == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("<empty>");
          props_Empty = cpb.create();
        }
        return props_Empty;
      case LanguageConceptSwitch.Event:
        if (props_Event == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Event = cpb.create();
        }
        return props_Event;
      case LanguageConceptSwitch.GetInfo:
        if (props_GetInfo == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Det informations");
          props_GetInfo = cpb.create();
        }
        return props_GetInfo;
      case LanguageConceptSwitch.Menu:
        if (props_Menu == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("menu");
          props_Menu = cpb.create();
        }
        return props_Menu;
      case LanguageConceptSwitch.Other:
        if (props_Other == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Other");
          props_Other = cpb.create();
        }
        return props_Other;
      case LanguageConceptSwitch.WorkSpace:
        if (props_WorkSpace == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_WorkSpace = cpb.create();
        }
        return props_WorkSpace;
    }
    return null;
  }
}
