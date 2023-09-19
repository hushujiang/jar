package com.github.catvod.spider.merge.p020V;

import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

@Deprecated
/* renamed from: com.github.catvod.spider.merge.V.f */
/* loaded from: classes.dex */
public final class C0224f extends AbstractC0220b {

    /* renamed from: b */
    private final HashMap<String, String> f401b = new HashMap<>();

    /* renamed from: c */
    private final HashSet<Character> f402c = new HashSet<>();

    /* renamed from: d */
    private final int f403d;

    /* renamed from: e */
    private final int f404e;

    public C0224f(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.f401b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.f402c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.f403d = i;
        this.f404e = i2;
    }

    @Override // com.github.catvod.spider.merge.p020V.AbstractC0220b
    /* renamed from: a */
    public final int mo1110a(CharSequence charSequence, int i, Writer writer) {
        if (this.f402c.contains(Character.valueOf(charSequence.charAt(i)))) {
            int i2 = this.f404e;
            if (i + i2 > charSequence.length()) {
                i2 = charSequence.length() - i;
            }
            while (i2 >= this.f403d) {
                String str = this.f401b.get(charSequence.subSequence(i, i + i2).toString());
                if (str != null) {
                    writer.write(str);
                    return i2;
                }
                i2--;
            }
            return 0;
        }
        return 0;
    }
}
