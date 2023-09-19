package com.github.catvod.spider.merge.p037g0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0520a;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.g0.d */
/* loaded from: classes.dex */
public final class C0532d implements InterfaceC0520a {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0520a
    /* renamed from: a */
    public final C0525f mo396a(C0459g c0459g) {
        C0459g c0459g2 = new C0459g();
        Iterator<C0293m> it = c0459g.iterator();
        while (it.hasNext()) {
            c0459g2.addAll(it.next().m986V());
        }
        return new C0525f(c0459g2);
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0520a
    public final String name() {
        return atm.m897d("0912131928");
    }
}
