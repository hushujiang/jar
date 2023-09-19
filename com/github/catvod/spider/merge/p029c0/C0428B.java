package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.AbstractC0299s;
import com.github.catvod.spider.merge.p025a0.C0285e;
import com.github.catvod.spider.merge.p025a0.C0289i;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* renamed from: com.github.catvod.spider.merge.c0.B */
/* loaded from: classes.dex */
public final class C0428B extends AbstractC0440N {
    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        for (AbstractC0299s abstractC0299s : c0293m2.m921i()) {
            if (!(abstractC0299s instanceof C0285e) && !(abstractC0299s instanceof C0289i)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return atm.m897d("501F17053821");
    }
}
