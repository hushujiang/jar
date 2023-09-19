package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.c0.X */
/* loaded from: classes.dex */
public final class C0449X extends AbstractC0453a0 {
    public C0449X(AbstractC0440N abstractC0440N) {
        this.f871a = abstractC0440N;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        if (c0293m == c0293m2) {
            return false;
        }
        do {
            c0293m2 = c0293m2.m971l0();
            if (c0293m2 == null) {
                break;
            } else if (this.f871a.mo599a(c0293m, c0293m2)) {
                return true;
            }
        } while (c0293m2 != c0293m);
        return false;
    }

    public final String toString() {
        return String.format(atm.m897d("4F095A"), this.f871a);
    }
}
