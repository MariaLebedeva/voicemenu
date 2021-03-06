package VoiceMenuTest.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_Outcome extends EnumerationDescriptorBase {

  public EnumerationDescriptor_Outcome() {
    super(0x25057fc953374f2eL, 0x9703a17097079193L, 0x72ec05e3886dfc12L, "Outcome", "r:9b5fab12-3317-4915-baca-42b08fc481a5(VoiceMenuTest.structure)/8281000289632123922");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_Success_0 = new EnumerationDescriptor.MemberDescriptor("Success", "Success", 0x72ec05e3886dfc13L, "r:9b5fab12-3317-4915-baca-42b08fc481a5(VoiceMenuTest.structure)/8281000289632123923");
  private final EnumerationDescriptor.MemberDescriptor myMember_Failure_0 = new EnumerationDescriptor.MemberDescriptor("Failure", "Failure", 0x72ec05e3886dfc14L, "r:9b5fab12-3317-4915-baca-42b08fc481a5(VoiceMenuTest.structure)/8281000289632123924");
  private final EnumerationDescriptor.MemberDescriptor myMember_Unknown_0 = new EnumerationDescriptor.MemberDescriptor("Unknown", "Unknown", 0x72ec05e3886dfc17L, "r:9b5fab12-3317-4915-baca-42b08fc481a5(VoiceMenuTest.structure)/8281000289632123927");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x25057fc953374f2eL, 0x9703a17097079193L, 0x72ec05e3886dfc12L, 0x72ec05e3886dfc13L, 0x72ec05e3886dfc14L, 0x72ec05e3886dfc17L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_Success_0, myMember_Failure_0, myMember_Unknown_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return myMember_Unknown_0;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "Success":
        return myMember_Success_0;
      case "Failure":
        return myMember_Failure_0;
      case "Unknown":
        return myMember_Unknown_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
