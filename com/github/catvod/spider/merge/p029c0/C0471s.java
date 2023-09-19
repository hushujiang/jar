package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* renamed from: com.github.catvod.spider.merge.c0.s */
/* loaded from: classes.dex */
public final class C0471s extends AbstractC0440N {

    /* renamed from: a */
    public final /* synthetic */ int f887a;

    /* renamed from: b */
    private final String f888b;

    public C0471s(String str, int i) {
        this.f887a = i;
        if (i == 1) {
            this.f888b = str;
            return;
        }
        StringBuilder m1058b = C0280b.m1058b();
        C0280b.m1059a(m1058b, str, false);
        this.f888b = C0441O.m624a(C0280b.m1052h(m1058b));
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        switch (this.f887a) {
            case 0:
                return C0441O.m624a(c0293m2.m960w0()).contains(this.f888b);
            default:
                return c0293m2.m973j0().equals(this.f888b);
        }
    }

    public final String toString() {
        switch (this.f887a) {
            case 0:
                return String.format(atm.m897d("5019151B38390314095D692B43"), this.f888b);
            default:
                return String.format(atm.m897d("4F09"), this.f888b);
        }
    }
}
