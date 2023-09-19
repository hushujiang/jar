package com.github.catvod.spider.merge.p020V;

import java.io.Writer;

@Deprecated
/* renamed from: com.github.catvod.spider.merge.V.a */
/* loaded from: classes.dex */
public final class C0219a extends AbstractC0220b {

    /* renamed from: b */
    private final AbstractC0220b[] f387b;

    public C0219a(AbstractC0220b... abstractC0220bArr) {
        this.f387b = (AbstractC0220b[]) ((Object[]) abstractC0220bArr.clone());
    }

    @Override // com.github.catvod.spider.merge.p020V.AbstractC0220b
    /* renamed from: a */
    public final int mo1110a(CharSequence charSequence, int i, Writer writer) {
        for (AbstractC0220b abstractC0220b : this.f387b) {
            int mo1110a = abstractC0220b.mo1110a(charSequence, i, writer);
            if (mo1110a != 0) {
                return mo1110a;
            }
        }
        return 0;
    }
}
