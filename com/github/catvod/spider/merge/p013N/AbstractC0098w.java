package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.p014O.C0119S;
import com.github.catvod.spider.merge.p016Q.C0187i;
import com.github.catvod.spider.merge.p017R.C0193a;
import com.github.catvod.spider.merge.p017R.C0199g;
import com.github.catvod.spider.merge.p017R.InterfaceC0195c;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: com.github.catvod.spider.merge.N.w */
/* loaded from: classes.dex */
public abstract class AbstractC0098w extends AbstractC0067B<InterfaceC0069D, C0119S> {

    /* renamed from: d */
    protected C0090o f166d = new C0090o();

    /* renamed from: e */
    protected InterfaceC0072G f167e;

    /* renamed from: f */
    protected final C0187i f168f;

    /* renamed from: g */
    protected C0099x f169g;

    /* renamed from: h */
    protected boolean f170h;

    /* renamed from: i */
    private C0097v f171i;

    /* renamed from: j */
    protected List<InterfaceC0195c> f172j;

    /* renamed from: k */
    protected boolean f173k;

    static {
        new WeakHashMap();
    }

    public AbstractC0098w(InterfaceC0072G interfaceC0072G) {
        C0187i c0187i = new C0187i();
        this.f168f = c0187i;
        c0187i.m1213a(0);
        this.f170h = true;
        this.f167e = null;
        C0090o c0090o = this.f166d;
        c0090o.f147a = false;
        c0090o.f149c = null;
        c0090o.f148b = -1;
        this.f169g = null;
        this.f173k = false;
        m1324s(this.f171i);
        this.f171i = null;
        c0187i.m1212b();
        c0187i.m1213a(0);
        ATNInterpreter atninterpreter = this.f108b;
        if (atninterpreter != 0) {
            atninterpreter.mo1251a();
        }
        this.f167e = interfaceC0072G;
    }

    @Override // com.github.catvod.spider.merge.p013N.AbstractC0067B
    /* renamed from: h */
    public final boolean mo1334h(int i) {
        C0187i c0187i = this.f168f;
        return i >= c0187i.m1211c(c0187i.m1208f() + (-1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.github.catvod.spider.merge.R.c>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List<com.github.catvod.spider.merge.R.c>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List<com.github.catvod.spider.merge.R.c>, java.util.ArrayList] */
    /* renamed from: j */
    public final InterfaceC0069D m1333j() {
        InterfaceC0069D m1328o = m1328o();
        if (m1328o.getType() != -1) {
            this.f167e.mo1341j();
        }
        ?? r1 = this.f172j;
        boolean z = (r1 == 0 || r1.isEmpty()) ? false : true;
        if (this.f170h || z) {
            if (this.f166d.f147a) {
                C0099x c0099x = this.f169g;
                C0193a c0193a = new C0193a(m1328o);
                c0099x.getClass();
                c0099x.m1322g(c0193a);
                ?? r12 = this.f172j;
                if (r12 != 0) {
                    Iterator it = r12.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0195c) it.next()).m1186a();
                    }
                }
            } else {
                C0099x c0099x2 = this.f169g;
                C0199g c0199g = new C0199g(m1328o);
                c0099x2.getClass();
                c0099x2.m1322g(c0199g);
                ?? r13 = this.f172j;
                if (r13 != 0) {
                    Iterator it2 = r13.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC0195c) it2.next()).m1185i(c0199g);
                    }
                }
            }
        }
        return m1328o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.R.b>, java.util.ArrayList] */
    /* renamed from: k */
    public final void m1332k(C0099x c0099x) {
        C0099x c0099x2;
        C0099x c0099x3;
        if (this.f170h && (c0099x2 = this.f169g) != c0099x && (c0099x3 = (C0099x) c0099x2.f111a) != null) {
            ?? r1 = c0099x3.f174d;
            if (r1 != 0) {
                r1.remove(r1.size() - 1);
            }
            c0099x3.m1322g(c0099x);
        }
        this.f169g = c0099x;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.R.c>, java.util.ArrayList] */
    /* renamed from: l */
    public final void m1331l(C0099x c0099x, int i) {
        m1390i(i);
        this.f169g = c0099x;
        c0099x.f175e = this.f167e.mo1359g(1);
        if (this.f170h) {
            C0099x c0099x2 = this.f169g;
            C0099x c0099x3 = (C0099x) c0099x2.f111a;
            if (c0099x3 != null) {
                c0099x3.m1322g(c0099x2);
            }
        }
        ?? r2 = this.f172j;
        if (r2 != 0) {
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                InterfaceC0195c interfaceC0195c = (InterfaceC0195c) it.next();
                interfaceC0195c.m1188R(this.f169g);
                this.f169g.mo474h(interfaceC0195c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.R.c>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.github.catvod.spider.merge.R.c>, java.util.ArrayList] */
    /* renamed from: m */
    public final void m1330m() {
        C0099x c0099x;
        InterfaceC0069D mo1359g;
        if (this.f173k) {
            c0099x = this.f169g;
            mo1359g = this.f167e.mo1359g(1);
        } else {
            c0099x = this.f169g;
            mo1359g = this.f167e.mo1359g(-1);
        }
        c0099x.f176f = mo1359g;
        ?? r0 = this.f172j;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                InterfaceC0195c interfaceC0195c = (InterfaceC0195c) this.f172j.get(size);
                this.f169g.mo473i(interfaceC0195c);
                interfaceC0195c.m1187X(this.f169g);
            }
        }
        m1390i(this.f169g.f112b);
        this.f169g = (C0099x) this.f169g.f111a;
    }

    /* renamed from: n */
    public final C0099x m1329n() {
        return this.f169g;
    }

    /* renamed from: o */
    public final InterfaceC0069D m1328o() {
        return this.f167e.mo1359g(1);
    }

    /* renamed from: p */
    public final int m1327p() {
        if (this.f168f.m1210d()) {
            return -1;
        }
        C0187i c0187i = this.f168f;
        return c0187i.m1211c(c0187i.m1208f() - 1);
    }

    /* renamed from: q */
    public final InterfaceC0069D m1326q(int i) {
        InterfaceC0069D m1328o = m1328o();
        if (m1328o.getType() == i) {
            if (i == -1) {
                this.f173k = true;
            }
            this.f166d.m1350i();
            m1333j();
        } else {
            m1328o = this.f166d.mo298g(this);
            if (this.f170h && m1328o.mo1362c() == -1) {
                C0099x c0099x = this.f169g;
                C0193a c0193a = new C0193a(m1328o);
                c0099x.getClass();
                c0099x.m1322g(c0193a);
            }
        }
        return m1328o;
    }

    /* renamed from: r */
    public final void m1325r(InterfaceC0069D interfaceC0069D, String str, C0101z c0101z) {
        ((C0100y) m1393e()).mo1316c(this, interfaceC0069D, interfaceC0069D.getLine(), interfaceC0069D.mo1364a(), str, c0101z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.R.c>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.R.c>, java.util.ArrayList] */
    /* renamed from: s */
    public final void m1324s(InterfaceC0195c interfaceC0195c) {
        ?? r0 = this.f172j;
        if (r0 != 0 && r0.remove(interfaceC0195c) && this.f172j.isEmpty()) {
            this.f172j = null;
        }
    }

    /* renamed from: t */
    public final void m1323t(C0090o c0090o) {
        this.f166d = c0090o;
    }
}
