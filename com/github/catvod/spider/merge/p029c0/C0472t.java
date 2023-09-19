package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* renamed from: com.github.catvod.spider.merge.c0.t */
/* loaded from: classes.dex */
public final class C0472t extends AbstractC0440N {

    /* renamed from: a */
    public final /* synthetic */ int f889a;

    /* renamed from: b */
    private final String f890b;

    public /* synthetic */ C0472t(String str, int i) {
        this.f889a = i;
        this.f890b = str;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        switch (this.f889a) {
            case 0:
                return c0293m2.m958y0().contains(this.f890b);
            default:
                return c0293m2.m973j0().endsWith(this.f890b);
        }
    }

    public final String toString() {
        switch (this.f889a) {
            case 0:
                return String.format(atm.m897d("5019151B3839031409222437061F3502220C0F020E5D692B43"), this.f890b);
            default:
                return String.format(atm.m897d("4F09"), this.f890b);
        }
    }
}
