package com.github.catvod.spider.merge.p020V;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.io.Writer;

@Deprecated
/* renamed from: com.github.catvod.spider.merge.V.k */
/* loaded from: classes.dex */
public final class C0229k extends AbstractC0220b {
    @Override // com.github.catvod.spider.merge.p020V.AbstractC0220b
    /* renamed from: a */
    public final int mo1110a(CharSequence charSequence, int i, Writer writer) {
        int i2;
        int i3;
        if (charSequence.charAt(i) == '\\' && (i2 = i + 1) < charSequence.length() && charSequence.charAt(i2) == 'u') {
            int i4 = 2;
            while (true) {
                i3 = i + i4;
                if (i3 >= charSequence.length() || charSequence.charAt(i3) != 'u') {
                    break;
                }
                i4++;
            }
            if (i3 < charSequence.length() && charSequence.charAt(i3) == '+') {
                i4++;
            }
            int i5 = i + i4;
            int i6 = i5 + 4;
            if (i6 > charSequence.length()) {
                StringBuilder m635a = C0424a.m635a(atm.m897d("261F09066C2C021B14557878021F025528310D130E066C31045A0F1B253B051E1F553A39060F1F4F6C7F"));
                m635a.append((Object) charSequence.subSequence(i, charSequence.length()));
                m635a.append(atm.m897d("4D5A1E0029781E155A10223C4A151C550F300B0829103D2D0F141910"));
                throw new IllegalArgumentException(m635a.toString());
            }
            CharSequence subSequence = charSequence.subSequence(i5, i6);
            try {
                writer.write((char) Integer.parseInt(subSequence.toString(), 16));
                return i4 + 4;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(atm.m897d("3F141B17203D4A0E15553C3918091F5539360319151129781C1B160029624A") + ((Object) subSequence), e);
            }
        }
        return 0;
    }
}
