package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0283c;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p029c0.C0441O;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.j1 */
/* loaded from: classes.dex */
public abstract class AbstractC0391j1 {

    /* renamed from: a */
    protected C0321F f836a;

    /* renamed from: b */
    C0362a f837b;

    /* renamed from: c */
    C0346S f838c;

    /* renamed from: d */
    protected C0288h f839d;

    /* renamed from: e */
    protected ArrayList<C0293m> f840e;

    /* renamed from: f */
    protected String f841f;

    /* renamed from: g */
    protected AbstractC0341P f842g;

    /* renamed from: h */
    protected C0319E f843h;

    /* renamed from: i */
    protected Map<String, C0323G> f844i;

    /* renamed from: j */
    private C0337N f845j = new C0337N();

    /* renamed from: k */
    private C0335M f846k = new C0335M();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final C0293m m649a() {
        int size = this.f840e.size();
        return size > 0 ? this.f840e.get(size - 1) : this.f839d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean m648b(String str) {
        C0293m m649a;
        return (this.f840e.size() == 0 || (m649a = m649a()) == null || !m649a.m973j0().equals(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo647c(Reader reader, C0321F c0321f) {
        C0288h c0288h = new C0288h("");
        this.f839d = c0288h;
        c0288h.m1008C0(c0321f);
        this.f836a = c0321f;
        this.f843h = C0319E.f664c;
        C0362a c0362a = new C0362a(reader, 32768);
        this.f837b = c0362a;
        c0362a.m748O(c0321f.m847c());
        this.f842g = null;
        this.f838c = new C0346S(this.f837b, c0321f.m849a());
        this.f840e = new ArrayList<>(32);
        this.f844i = new HashMap();
        this.f841f = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo646d(String str);

    /* renamed from: e */
    protected abstract boolean mo645e(AbstractC0341P abstractC0341P);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean m644f(String str) {
        AbstractC0341P abstractC0341P = this.f842g;
        C0335M c0335m = this.f846k;
        if (abstractC0341P == c0335m) {
            C0335M c0335m2 = new C0335M();
            c0335m2.m815v(str);
            return mo645e(c0335m2);
        }
        c0335m.mo803h();
        c0335m.m815v(str);
        return mo645e(c0335m);
    }

    /* renamed from: g */
    public boolean m643g(C0283c c0283c) {
        C0337N c0337n = this.f845j;
        AbstractC0341P abstractC0341P = this.f842g;
        String m897d = atm.m897d("03140A0038");
        if (abstractC0341P == c0337n) {
            c0337n = new C0337N();
            c0337n.f694d = m897d;
            c0337n.f704n = c0283c;
        } else {
            c0337n.mo812y();
            c0337n.f694d = m897d;
            c0337n.f704n = c0283c;
        }
        c0337n.f695e = C0441O.m624a(m897d);
        return mo645e(c0337n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean m642h(String str) {
        C0337N c0337n = this.f845j;
        if (this.f842g == c0337n) {
            c0337n = new C0337N();
        } else {
            c0337n.mo812y();
        }
        c0337n.m815v(str);
        return mo645e(c0337n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.b0.G>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.b0.G>, java.util.HashMap] */
    /* renamed from: i */
    public final C0323G m641i(String str, C0319E c0319e) {
        C0323G c0323g = (C0323G) this.f844i.get(str);
        if (c0323g == null) {
            C0323G m833m = C0323G.m833m(str, c0319e);
            this.f844i.put(str, m833m);
            return m833m;
        }
        return c0323g;
    }
}
