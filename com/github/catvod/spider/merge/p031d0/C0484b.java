package com.github.catvod.spider.merge.p031d0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p029c0.C0459g;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.d0.b */
/* loaded from: classes.dex */
public final class C0484b {

    /* renamed from: a */
    private Object f913a;

    public C0484b(Object obj) {
        this.f913a = obj;
    }

    /* renamed from: a */
    public final String m573a() {
        Object obj = this.f913a;
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0293m) {
            C0293m c0293m = (C0293m) obj;
            String m962u0 = c0293m.m962u0();
            String m897d = atm.m897d("2022252109003E");
            return m962u0 == m897d || (m962u0 != null && m962u0.equals(m897d)) ? c0293m.m972k0() : c0293m.mo912u();
        }
        return String.valueOf(obj);
    }

    /* renamed from: b */
    public final List<C0484b> m572b(String str) {
        if (this.f913a instanceof C0293m) {
            return new C0483a(new C0459g((C0293m) this.f913a)).m574b(str);
        }
        return null;
    }

    /* renamed from: c */
    public final C0484b m571c(String str) {
        List<C0484b> m572b = m572b(str);
        if (m572b != null) {
            LinkedList linkedList = (LinkedList) m572b;
            if (linkedList.size() > 0) {
                return (C0484b) linkedList.get(0);
            }
            return null;
        }
        return null;
    }

    public final String toString() {
        return m573a();
    }
}
