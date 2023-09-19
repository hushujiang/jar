package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p025a0.C0293m;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.c0.e */
/* loaded from: classes.dex */
public final class C0457e extends AbstractC0458f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0457e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0457e(AbstractC0440N... abstractC0440NArr) {
        List asList = Arrays.asList(abstractC0440NArr);
        if (this.f876b > 1) {
            this.f875a.add(new C0456d(asList));
        } else {
            this.f875a.addAll(asList);
        }
        m607b();
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        for (int i = 0; i < this.f876b; i++) {
            if (this.f875a.get(i).mo599a(c0293m, c0293m2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return C0280b.m1054f(this.f875a, atm.m897d("465A"));
    }
}
