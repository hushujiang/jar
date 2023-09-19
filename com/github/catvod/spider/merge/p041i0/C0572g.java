package com.github.catvod.spider.merge.p041i0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p018S.C0207h;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p025a0.C0302v;
import com.github.catvod.spider.merge.p029c0.C0441O;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0523d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.i0.g */
/* loaded from: classes.dex */
public final class C0572g implements InterfaceC0523d {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0523d
    /* renamed from: a */
    public final C0525f mo313a(C0524e c0524e) {
        Integer num;
        C0459g m462a = c0524e.m462a();
        C0459g c0459g = new C0459g();
        HashMap hashMap = new HashMap();
        if (m462a != null && m462a.size() > 0) {
            if (c0524e.m457f()) {
                Iterator<C0293m> it = m462a.iterator();
                while (it.hasNext()) {
                    C0441O.m622c(new C0571f(hashMap, c0459g), it.next());
                }
                Iterator<C0293m> it2 = c0459g.iterator();
                while (it2.hasNext()) {
                    C0293m next = it2.next();
                    String mo925d = next.mo925d(atm.m897d("2F36253109083E32"));
                    if (C0207h.m1171d(mo925d) && (num = (Integer) hashMap.get(mo925d)) != null) {
                        C0277c.m1060o(next, num.intValue());
                    }
                }
            } else {
                Iterator<C0293m> it3 = m462a.iterator();
                while (it3.hasNext()) {
                    C0293m next2 = it3.next();
                    boolean equals = atm.m897d("1919081C3C2C").equals(next2.mo900t());
                    String m897d = atm.m897d("2022252109003E");
                    if (equals) {
                        C0293m c0293m = new C0293m(m897d);
                        c0293m.mo961v0(next2.m985X());
                        C0277c.m1061n(c0293m, 1);
                        C0277c.m1060o(c0293m, 1);
                        c0459g.add(c0293m);
                    } else {
                        List<C0302v> m959x0 = next2.m959x0();
                        int i = 0;
                        while (i < m959x0.size()) {
                            C0293m c0293m2 = new C0293m(m897d);
                            c0293m2.mo961v0(m959x0.get(i).m906L());
                            i++;
                            C0277c.m1061n(c0293m2, i);
                            C0277c.m1060o(c0293m2, m959x0.size());
                            c0459g.add(c0293m2);
                        }
                    }
                }
            }
        }
        return new C0525f(c0459g);
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0523d
    public final String name() {
        return atm.m897d("1E1F0201");
    }
}
