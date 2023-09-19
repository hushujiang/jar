package com.github.catvod.spider.merge.p020V;

import java.io.Writer;

@Deprecated
/* renamed from: com.github.catvod.spider.merge.V.j */
/* loaded from: classes.dex */
public final class C0228j extends AbstractC0220b {
    /* renamed from: b */
    private boolean m1111b(char c) {
        return c >= '0' && c <= '7';
    }

    @Override // com.github.catvod.spider.merge.p020V.AbstractC0220b
    /* renamed from: a */
    public final int mo1110a(CharSequence charSequence, int i, Writer writer) {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        if (charSequence.charAt(i) == '\\' && length > 0) {
            int i2 = i + 1;
            if (m1111b(charSequence.charAt(i2))) {
                int i3 = i + 2;
                int i4 = i + 3;
                sb.append(charSequence.charAt(i2));
                if (length > 1 && m1111b(charSequence.charAt(i3))) {
                    sb.append(charSequence.charAt(i3));
                    if (length > 2) {
                        char charAt = charSequence.charAt(i2);
                        if (charAt >= '0' && charAt <= '3') {
                            z = true;
                        }
                        if (z && m1111b(charSequence.charAt(i4))) {
                            sb.append(charSequence.charAt(i4));
                        }
                    }
                }
                writer.write(Integer.parseInt(sb.toString(), 8));
                return sb.length() + 1;
            }
        }
        return 0;
    }
}
