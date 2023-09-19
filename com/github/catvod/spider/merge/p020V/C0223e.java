package com.github.catvod.spider.merge.p020V;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.io.Writer;
import java.util.Locale;

@Deprecated
/* renamed from: com.github.catvod.spider.merge.V.e */
/* loaded from: classes.dex */
public final class C0223e extends AbstractC0221c {

    /* renamed from: b */
    private final int f399b = 32;

    /* renamed from: c */
    private final int f400c = 127;

    @Override // com.github.catvod.spider.merge.p020V.AbstractC0221c
    /* renamed from: b */
    public final boolean mo1109b(int i, Writer writer) {
        if (i < this.f399b || i > this.f400c) {
            String m897d = atm.m897d("360F");
            if (i <= 65535) {
                writer.write(m897d);
                char[] cArr = AbstractC0220b.f388a;
                writer.write(cArr[(i >> 12) & 15]);
                writer.write(cArr[(i >> 8) & 15]);
                writer.write(cArr[(i >> 4) & 15]);
                writer.write(cArr[i & 15]);
                return true;
            }
            char[] chars = Character.toChars(i);
            StringBuilder m635a = C0424a.m635a(m897d);
            String hexString = Integer.toHexString(chars[0]);
            Locale locale = Locale.ENGLISH;
            m635a.append(hexString.toUpperCase(locale));
            m635a.append(m897d);
            m635a.append(Integer.toHexString(chars[1]).toUpperCase(locale));
            writer.write(m635a.toString());
            return true;
        }
        return false;
    }
}
