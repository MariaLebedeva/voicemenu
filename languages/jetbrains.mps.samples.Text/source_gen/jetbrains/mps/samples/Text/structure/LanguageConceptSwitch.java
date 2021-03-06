package jetbrains.mps.samples.Text.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Argument = 0;
  public static final int Body = 1;
  public static final int Command = 2;
  public static final int Comment = 3;
  public static final int Context = 4;
  public static final int ContextReference = 5;
  public static final int Empty = 6;
  public static final int Extend = 7;
  public static final int GoTo = 8;
  public static final int PlainText = 9;
  public static final int Same = 10;
  public static final int WorkSpace = 11;
  public static final int general1arg = 12;
  public static final int general2args = 13;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x914c58c4068049cfL, 0x8599f5ced7a657d6L);
    builder.put(0x13a8ce4f715c9dbdL, Argument);
    builder.put(0x6a75f8ea191bcebL, Body);
    builder.put(0x10bb6449f9c96432L, Command);
    builder.put(0x13a8ce4f715c9d8cL, Comment);
    builder.put(0x13a8ce4f715c9d61L, Context);
    builder.put(0x6a75f8ea1a2e649L, ContextReference);
    builder.put(0x13a8ce4f7160944aL, Empty);
    builder.put(0x13a8ce4f715c9dafL, Extend);
    builder.put(0x6a75f8ea190a0a1L, GoTo);
    builder.put(0x13a8ce4f716049b6L, PlainText);
    builder.put(0x13a8ce4f7160338bL, Same);
    builder.put(0x10bb6449f9c963fcL, WorkSpace);
    builder.put(0x6a75f8ea190a09dL, general1arg);
    builder.put(0x6b5142eafd0410bdL, general2args);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
