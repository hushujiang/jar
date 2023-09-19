package com.github.catvod.spider.merge.p020V;

import java.io.Writer;

@Deprecated
/* renamed from: com.github.catvod.spider.merge.V.c */
/* loaded from: classes.dex */
public abstract class AbstractC0221c extends AbstractC0220b {
    @Override // com.github.catvod.spider.merge.p020V.AbstractC0220b
    /* renamed from: a */
    public final int mo1110a(CharSequence charSequence, int i, Writer writer) {
        return mo1109b(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    /* renamed from: b */
    public abstract boolean mo1109b(int i, Writer writer);
}
