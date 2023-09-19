package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p025a0.C0293m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.c0.g */
/* loaded from: classes.dex */
public final class C0459g extends ArrayList<C0293m> {
    public C0459g() {
    }

    public C0459g(int i) {
        super(i);
    }

    public C0459g(List<C0293m> list) {
        super(list);
    }

    public C0459g(C0293m... c0293mArr) {
        super(Arrays.asList(c0293mArr));
    }

    /* renamed from: a */
    public final String m606a(String str) {
        Iterator<C0293m> it = iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            if (next.m917o(str)) {
                return next.mo925d(str);
            }
        }
        return "";
    }

    /* renamed from: b */
    public final List<String> m605b() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<C0293m> it = iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            if (next.m980c0()) {
                arrayList.add(next.m960w0());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C0293m m604c() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C0459g c0459g = new C0459g(size());
        Iterator<C0293m> it = iterator();
        while (it.hasNext()) {
            c0459g.add(it.next().mo902j());
        }
        return c0459g;
    }

    /* renamed from: d */
    public final C0459g m603d(String str) {
        C0277c.m1065j(str);
        AbstractC0440N m612j = C0443Q.m612j(str);
        C0459g c0459g = new C0459g();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<C0293m> it = iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            C0277c.m1063l(m612j);
            C0277c.m1063l(next);
            Iterator<C0293m> it2 = C0455c.m609a(m612j, next).iterator();
            while (it2.hasNext()) {
                C0293m next2 = it2.next();
                if (identityHashMap.put(next2, Boolean.TRUE) == null) {
                    c0459g.add(next2);
                }
            }
        }
        return c0459g;
    }

    /* renamed from: e */
    public final String m602e() {
        StringBuilder m1058b = C0280b.m1058b();
        Iterator<C0293m> it = iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            if (m1058b.length() != 0) {
                m1058b.append(atm.m897d("4A"));
            }
            m1058b.append(next.m960w0());
        }
        return C0280b.m1052h(m1058b);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder m1058b = C0280b.m1058b();
        Iterator<C0293m> it = iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            if (m1058b.length() != 0) {
                m1058b.append(atm.m897d("60"));
            }
            m1058b.append(next.mo912u());
        }
        return C0280b.m1052h(m1058b);
    }
}
