package com.github.catvod.spider.merge.p037g0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0520a;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.github.catvod.spider.merge.g0.g */
/* loaded from: classes.dex */
public final class C0535g implements InterfaceC0520a {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0520a
    /* renamed from: a */
    public final C0525f mo396a(C0459g c0459g) {
        LinkedList linkedList = new LinkedList();
        Iterator<C0293m> it = c0459g.iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            Iterator<C0293m> it2 = next.m970m0().iterator();
            while (it2.hasNext()) {
                C0459g m1070e = C0277c.m1070e(it2.next());
                if (m1070e != null) {
                    Iterator<C0293m> it3 = m1070e.iterator();
                    while (it3.hasNext()) {
                        linkedList.addAll(it3.next().m983Z());
                    }
                }
            }
            C0459g m1070e2 = C0277c.m1070e(next);
            if (m1070e2 != null) {
                Iterator<C0293m> it4 = m1070e2.iterator();
                while (it4.hasNext()) {
                    linkedList.addAll(it4.next().m983Z());
                }
            }
        }
        return new C0525f(new C0459g(linkedList));
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0520a
    public final String name() {
        return atm.m897d("0C151619232F03141D");
    }
}
