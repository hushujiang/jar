package com.github.catvod.spider.merge.p041i0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p018S.C0207h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0523d;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.i0.c */
/* loaded from: classes.dex */
public final class C0568c implements InterfaceC0523d {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0523d
    /* renamed from: a */
    public final C0525f mo313a(C0524e c0524e) {
        C0459g c0459g = new C0459g();
        Iterator<C0293m> it = c0524e.m462a().iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            c0459g.addAll(next.m986V());
            String m972k0 = next.m972k0();
            if (C0207h.m1171d(m972k0)) {
                C0293m c0293m = new C0293m("");
                c0293m.m991Q(m972k0);
                c0459g.add(c0293m);
            }
        }
        return new C0525f(c0459g);
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0523d
    public final String name() {
        return atm.m897d("04151E10");
    }
}
