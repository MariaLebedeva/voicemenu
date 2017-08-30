package jetbrains.mps.samples.Text.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class Extend_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("exten => ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0x914c58c4068049cfL, 0x8599f5ced7a657d6L, 0x13a8ce4f715c9dafL, 0x13a8ce4f715c9db2L, "target")));
    tgs.append(",");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0x914c58c4068049cfL, 0x8599f5ced7a657d6L, 0x13a8ce4f715c9dafL, 0x13a8ce4f715c9db4L, "priority")));
    tgs.append(",");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0x914c58c4068049cfL, 0x8599f5ced7a657d6L, 0x13a8ce4f715c9dafL, 0x13a8ce4f715c9db7L, "action")));
    if ((SLinkOperations.getTarget(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x914c58c4068049cfL, 0x8599f5ced7a657d6L, 0x13a8ce4f715c9dafL, 0x13a8ce4f715c9dbbL, "argument")) != null)) {
      tgs.appendNode(SLinkOperations.getTarget(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x914c58c4068049cfL, 0x8599f5ced7a657d6L, 0x13a8ce4f715c9dafL, 0x13a8ce4f715c9dbbL, "argument")));
    }
    tgs.newLine();
  }
}
