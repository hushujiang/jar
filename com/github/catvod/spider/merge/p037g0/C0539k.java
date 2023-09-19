package com.github.catvod.spider.merge.p037g0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0520a;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.github.catvod.spider.merge.g0.k */
/* loaded from: classes.dex */
public final class C0539k implements InterfaceC0520a {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0520a
    /* renamed from: a */
    public final C0525f mo396a(C0459g c0459g) {
        C0459g c0459g2 = new C0459g();
        LinkedList linkedList = new LinkedList();
        Iterator<C0293m> it = c0459g.iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            Iterator<C0293m> it2 = next.m970m0().iterator();
            while (it2.hasNext()) {
                C0459g m1062m = C0277c.m1062m(it2.next());
                if (m1062m != null) {
                    linkedList.addAll(m1062m);
                }
            }
            C0459g m1062m2 = C0277c.m1062m(next);
            if (m1062m2 != null) {
                linkedList.addAll(m1062m2);
            }
        }
        c0459g2.addAll(linkedList);
        return new C0525f(c0459g2);
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0520a
    public final String name() {
        return atm.m897d("1A081F16293C03141D");
    }
}
