package com.github.catvod.spider.merge.p018S;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p020V.AbstractC0220b;
import java.io.Writer;

/* renamed from: com.github.catvod.spider.merge.S.e */
/* loaded from: classes.dex */
final class C0204e extends AbstractC0220b {

    /* renamed from: b */
    private static final String f356b = String.valueOf('\"');

    /* renamed from: c */
    private static final char[] f357c = {',', '\"', '\r', '\n'};

    @Override // com.github.catvod.spider.merge.p020V.AbstractC0220b
    /* renamed from: a */
    public final int mo1110a(CharSequence charSequence, int i, Writer writer) {
        boolean z;
        if (i == 0) {
            String charSequence2 = charSequence.toString();
            char[] cArr = f357c;
            int i2 = C0207h.f362a;
            if (charSequence2 != null && cArr != null) {
                int length = charSequence2.length();
                int i3 = length - 1;
                int length2 = cArr.length;
                int i4 = length2 - 1;
                loop0: for (int i5 = 0; i5 < length; i5++) {
                    char charAt = charSequence2.charAt(i5);
                    for (int i6 = 0; i6 < length2; i6++) {
                        if (cArr[i6] == charAt && (!Character.isHighSurrogate(charAt) || i6 == i4 || (i5 < i3 && cArr[i6 + 1] == charSequence2.charAt(i5 + 1)))) {
                            z = false;
                            break loop0;
                        }
                    }
                }
            }
            z = true;
            if (z) {
                writer.write(charSequence.toString());
            } else {
                writer.write(34);
                String charSequence3 = charSequence.toString();
                String str = f356b;
                writer.write(C0207h.m1167h(charSequence3, str, str + str));
                writer.write(34);
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
        throw new IllegalStateException(atm.m897d("29090C303F3B0B0A1F076C2B02150F192878041F0C103E78181F1B1624781E121F551769375A131B283D12"));
    }
}
