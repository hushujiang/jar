package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* renamed from: com.github.catvod.spider.merge.c0.A */
/* loaded from: classes.dex */
public final class C0427A extends AbstractC0477y {
    public C0427A(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        return c0293m != c0293m2 && c0293m2.m984Y() < this.f895a;
    }

    public final String toString() {
        return String.format(atm.m897d("50160E5D693C43"), Integer.valueOf(this.f895a));
    }
}
