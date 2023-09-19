package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* renamed from: com.github.catvod.spider.merge.c0.q */
/* loaded from: classes.dex */
public final class C0469q extends AbstractC0462j {
    public C0469q(String str, String str2) {
        super(str, str2, false);
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        return c0293m2.m917o(this.f879a) && C0441O.m624a(c0293m2.mo925d(this.f879a)).startsWith(this.f880b);
    }

    public final String toString() {
        return String.format(atm.m897d("315F092B717D1927"), this.f879a, this.f880b);
    }
}
