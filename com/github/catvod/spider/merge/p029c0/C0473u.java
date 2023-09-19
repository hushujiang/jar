package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p025a0.C0290j;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* renamed from: com.github.catvod.spider.merge.c0.u */
/* loaded from: classes.dex */
public final class C0473u extends AbstractC0440N {

    /* renamed from: a */
    private final String f891a;

    public C0473u(String str) {
        this.f891a = str;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        StringBuilder m1058b = C0280b.m1058b();
        C0441O.m622c(new C0290j(m1058b), c0293m2);
        return C0280b.m1052h(m1058b).contains(this.f891a);
    }

    public final String toString() {
        return String.format(atm.m897d("5019151B3839031409222437061F2E10342C425F095C"), this.f891a);
    }
}
