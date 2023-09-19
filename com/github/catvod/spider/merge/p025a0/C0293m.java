package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p023Y.C0278d;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p027b0.C0319E;
import com.github.catvod.spider.merge.p027b0.C0323G;
import com.github.catvod.spider.merge.p029c0.AbstractC0440N;
import com.github.catvod.spider.merge.p029c0.C0441O;
import com.github.catvod.spider.merge.p029c0.C0443Q;
import com.github.catvod.spider.merge.p029c0.C0455c;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p029c0.C0460h;
import com.github.catvod.spider.merge.p029c0.C0475w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.a0.m */
/* loaded from: classes.dex */
public class C0293m extends AbstractC0299s {

    /* renamed from: h */
    private static final List<C0293m> f537h = Collections.emptyList();

    /* renamed from: i */
    private static final String f538i;

    /* renamed from: d */
    private C0323G f539d;

    /* renamed from: e */
    private WeakReference<List<C0293m>> f540e;

    /* renamed from: f */
    List<AbstractC0299s> f541f;

    /* renamed from: g */
    C0283c f542g;

    static {
        Pattern.compile(atm.m897d("360951"));
        f538i = C0283c.m1026s(atm.m897d("081B0910192A03"));
    }

    public C0293m(C0323G c0323g, String str, C0283c c0283c) {
        C0277c.m1063l(c0323g);
        this.f541f = AbstractC0299s.f557c;
        this.f542g = c0283c;
        this.f539d = c0323g;
        if (str != null) {
            mo919l(str);
        }
    }

    /* renamed from: L */
    private static void m996L(C0293m c0293m, C0459g c0459g) {
        C0293m c0293m2 = (C0293m) c0293m.f558a;
        if (c0293m2 == null || c0293m2.m962u0().equals(atm.m897d("4908151A38"))) {
            return;
        }
        c0459g.add(c0293m2);
        m996L(c0293m2, c0459g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static void m992P(StringBuilder sb, C0302v c0302v) {
        String m938I = c0302v.m938I();
        if (m969n0(c0302v.f558a) || (c0302v instanceof C0284d)) {
            sb.append(m938I);
        } else {
            C0280b.m1059a(sb, m938I, C0302v.m904N(sb));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static void m990R(AbstractC0299s abstractC0299s, StringBuilder sb) {
        if (abstractC0299s instanceof C0302v) {
            sb.append(((C0302v) abstractC0299s).m938I());
        } else if ((abstractC0299s instanceof C0293m) && ((C0293m) abstractC0299s).f539d.m836j().equals(atm.m897d("0808"))) {
            sb.append(atm.m897d("60"));
        }
    }

    /* renamed from: f0 */
    private static <E extends C0293m> int m977f0(C0293m c0293m, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == c0293m) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public static boolean m969n0(AbstractC0299s abstractC0299s) {
        if (abstractC0299s instanceof C0293m) {
            C0293m c0293m = (C0293m) abstractC0299s;
            int i = 0;
            while (!c0293m.f539d.m835k()) {
                c0293m = (C0293m) c0293m.f558a;
                i++;
                if (i < 6) {
                    if (c0293m == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.a0.s] */
    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: F */
    public final AbstractC0299s mo931F() {
        C0293m c0293m = this;
        while (true) {
            ?? r1 = c0293m.f558a;
            if (r1 == 0) {
                return c0293m;
            }
            c0293m = r1;
        }
    }

    /* renamed from: M */
    public final C0293m m995M(AbstractC0299s abstractC0299s) {
        AbstractC0299s abstractC0299s2 = abstractC0299s.f558a;
        if (abstractC0299s2 != null) {
            abstractC0299s2.mo933D(abstractC0299s);
        }
        abstractC0299s.f558a = this;
        mo918n();
        this.f541f.add(abstractC0299s);
        abstractC0299s.f559b = this.f541f.size() - 1;
        return this;
    }

    /* renamed from: N */
    public final C0293m m994N(Collection<? extends AbstractC0299s> collection) {
        if (collection != null) {
            int mo903h = mo903h();
            int i = (mo903h + 1) - 1;
            C0277c.m1066i(i >= 0 && i <= mo903h, atm.m897d("231409103E2C4A0A1506252C03151455232D1E5A15136C3A050F14113F76"));
            m927b(i, (AbstractC0299s[]) new ArrayList(collection).toArray(new AbstractC0299s[0]));
            return this;
        }
        throw new C0278d(atm.m897d("29121319282A0F145A162334061F19012537045A0E1A6C3A0F5A131B3F3D180E1F116C351F090E5522371E5A18106C361F16165B"));
    }

    /* renamed from: O */
    public final C0293m m993O(String str) {
        C0300t.m908a(this).getClass();
        C0293m c0293m = new C0293m(C0323G.m833m(str, C0319E.f664c), mo923f(), null);
        m995M(c0293m);
        return c0293m;
    }

    /* renamed from: Q */
    public final C0293m m991Q(String str) {
        C0277c.m1063l(str);
        m995M(new C0302v(str));
        return this;
    }

    /* renamed from: S */
    public final C0293m m989S(AbstractC0299s abstractC0299s) {
        C0277c.m1063l(this.f558a);
        this.f558a.m927b(this.f559b, abstractC0299s);
        return this;
    }

    /* renamed from: T */
    public final C0293m m988T() {
        return m987U().get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public final List<C0293m> m987U() {
        List<C0293m> list;
        if (mo903h() == 0) {
            return f537h;
        }
        WeakReference<List<C0293m>> weakReference = this.f540e;
        if (weakReference == null || (list = weakReference.get()) == null) {
            int size = this.f541f.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                AbstractC0299s abstractC0299s = this.f541f.get(i);
                if (abstractC0299s instanceof C0293m) {
                    arrayList.add((C0293m) abstractC0299s);
                }
            }
            this.f540e = new WeakReference<>(arrayList);
            return arrayList;
        }
        return list;
    }

    /* renamed from: V */
    public final C0459g m986V() {
        return new C0459g(m987U());
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: W */
    public C0293m mo902j() {
        return (C0293m) super.clone();
    }

    /* renamed from: X */
    public final String m985X() {
        String m938I;
        StringBuilder m1058b = C0280b.m1058b();
        for (AbstractC0299s abstractC0299s : this.f541f) {
            if (abstractC0299s instanceof C0286f) {
                m938I = ((C0286f) abstractC0299s).m938I();
            } else if (abstractC0299s instanceof C0285e) {
                m938I = ((C0285e) abstractC0299s).m938I();
            } else if (abstractC0299s instanceof C0293m) {
                m938I = ((C0293m) abstractC0299s).m985X();
            } else if (abstractC0299s instanceof C0284d) {
                m938I = ((C0284d) abstractC0299s).m938I();
            }
            m1058b.append(m938I);
        }
        return C0280b.m1052h(m1058b);
    }

    /* renamed from: Y */
    public final int m984Y() {
        AbstractC0299s abstractC0299s = this.f558a;
        if (((C0293m) abstractC0299s) == null) {
            return 0;
        }
        return m977f0(this, ((C0293m) abstractC0299s).m987U());
    }

    /* renamed from: Z */
    public final C0459g m983Z() {
        return C0455c.m609a(new C0460h(), this);
    }

    /* renamed from: a0 */
    public final C0293m m982a0(String str) {
        C0277c.m1065j(str);
        C0459g m609a = C0455c.m609a(new C0475w(str), this);
        if (m609a.size() > 0) {
            return m609a.get(0);
        }
        return null;
    }

    /* renamed from: b0 */
    public final boolean m981b0(String str) {
        C0283c c0283c = this.f542g;
        if (c0283c == null) {
            return false;
        }
        String m1032m = c0283c.m1032m(atm.m897d("09161B063F"));
        int length = m1032m.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(m1032m);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(m1032m.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else if (i2 - i == length2 && m1032m.regionMatches(true, i, str, 0, length2)) {
                        return true;
                    } else {
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return m1032m.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* renamed from: c0 */
    public final boolean m980c0() {
        for (AbstractC0299s abstractC0299s : this.f541f) {
            if (abstractC0299s instanceof C0302v) {
                if (!((C0302v) abstractC0299s).m905M()) {
                    return true;
                }
            } else if ((abstractC0299s instanceof C0293m) && ((C0293m) abstractC0299s).m980c0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d0 */
    public final String m979d0() {
        StringBuilder m1058b = C0280b.m1058b();
        int size = this.f541f.size();
        for (int i = 0; i < size; i++) {
            this.f541f.get(i).m911v(m1058b);
        }
        String m1052h = C0280b.m1052h(m1058b);
        C0288h m910y = m910y();
        if (m910y == null) {
            m910y = new C0288h("");
        }
        return m910y.m1009B0().m1012g() ? m1052h.trim() : m1052h;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: e */
    public final C0283c mo924e() {
        if (this.f542g == null) {
            this.f542g = new C0283c();
        }
        return this.f542g;
    }

    /* renamed from: e0 */
    public final String m978e0() {
        C0283c c0283c = this.f542g;
        return c0283c != null ? c0283c.m1032m(atm.m897d("031E")) : "";
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: f */
    public final String mo923f() {
        String str = f538i;
        for (C0293m c0293m = this; c0293m != null; c0293m = (C0293m) c0293m.f558a) {
            C0283c c0283c = c0293m.f542g;
            if (c0283c != null) {
                if (c0283c.m1028q(str) != -1) {
                    return c0293m.f542g.m1033l(str);
                }
            }
        }
        return "";
    }

    /* renamed from: g0 */
    public final boolean m976g0() {
        return this.f539d.m843c();
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: h */
    public final int mo903h() {
        return this.f541f.size();
    }

    /* renamed from: h0 */
    public final C0293m m975h0() {
        AbstractC0299s abstractC0299s = this.f558a;
        if (abstractC0299s == null) {
            return null;
        }
        List<C0293m> m987U = ((C0293m) abstractC0299s).m987U();
        int m977f0 = m977f0(this, m987U) + 1;
        if (m987U.size() > m977f0) {
            return m987U.get(m977f0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final void m974i0() {
        this.f540e = null;
    }

    /* renamed from: j0 */
    public final String m973j0() {
        return this.f539d.m836j();
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: k */
    protected final AbstractC0299s mo920k(AbstractC0299s abstractC0299s) {
        C0293m c0293m = (C0293m) super.mo920k(abstractC0299s);
        C0283c c0283c = this.f542g;
        c0293m.f542g = c0283c != null ? c0283c.clone() : null;
        C0292l c0292l = new C0292l(c0293m, this.f541f.size());
        c0293m.f541f = c0292l;
        c0292l.addAll(this.f541f);
        return c0293m;
    }

    /* renamed from: k0 */
    public final String m972k0() {
        StringBuilder m1058b = C0280b.m1058b();
        for (int i = 0; i < mo903h(); i++) {
            AbstractC0299s abstractC0299s = this.f541f.get(i);
            if (abstractC0299s instanceof C0302v) {
                m992P(m1058b, (C0302v) abstractC0299s);
            } else if ((abstractC0299s instanceof C0293m) && ((C0293m) abstractC0299s).f539d.m836j().equals(atm.m897d("0808")) && !C0302v.m904N(m1058b)) {
                m1058b.append(atm.m897d("4A"));
            }
        }
        return C0280b.m1052h(m1058b).trim();
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: l */
    protected final void mo919l(String str) {
        mo924e().m1022w(f538i, str);
    }

    /* renamed from: l0 */
    public final C0293m m971l0() {
        return (C0293m) this.f558a;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: m */
    public final AbstractC0299s mo901m() {
        this.f541f.clear();
        return this;
    }

    /* renamed from: m0 */
    public final C0459g m970m0() {
        C0459g c0459g = new C0459g();
        m996L(this, c0459g);
        return c0459g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: n */
    public final List<AbstractC0299s> mo918n() {
        if (this.f541f == AbstractC0299s.f557c) {
            this.f541f = new C0292l(this, 4);
        }
        return this.f541f;
    }

    /* renamed from: o0 */
    public final C0293m m968o0() {
        List<C0293m> m987U;
        int m977f0;
        AbstractC0299s abstractC0299s = this.f558a;
        if (abstractC0299s != null && (m977f0 = m977f0(this, (m987U = ((C0293m) abstractC0299s).m987U()))) > 0) {
            return m987U.get(m977f0 - 1);
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: p */
    protected final boolean mo916p() {
        return this.f542g != null;
    }

    /* renamed from: p0 */
    public final C0459g m967p0(String str) {
        C0277c.m1065j(str);
        AbstractC0440N m612j = C0443Q.m612j(str);
        C0277c.m1063l(m612j);
        return C0455c.m609a(m612j, this);
    }

    /* renamed from: q0 */
    public final C0293m m966q0(String str) {
        C0277c.m1065j(str);
        return C0455c.m608b(C0443Q.m612j(str), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m965r0(com.github.catvod.spider.merge.p025a0.C0287g r5) {
        /*
            r4 = this;
            boolean r5 = r5.m1012g()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.b0.G r5 = r4.f539d
            boolean r5 = r5.m845a()
            if (r5 != 0) goto L20
            com.github.catvod.spider.merge.a0.s r5 = r4.f558a
            com.github.catvod.spider.merge.a0.m r5 = (com.github.catvod.spider.merge.p025a0.C0293m) r5
            if (r5 == 0) goto L1e
            com.github.catvod.spider.merge.b0.G r5 = r5.f539d
            boolean r5 = r5.m845a()
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L21
        L20:
            r5 = 1
        L21:
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.b0.G r5 = r4.f539d
            boolean r5 = r5.m840f()
            if (r5 == 0) goto L54
            com.github.catvod.spider.merge.a0.s r5 = r4.f558a
            com.github.catvod.spider.merge.a0.m r5 = (com.github.catvod.spider.merge.p025a0.C0293m) r5
            if (r5 == 0) goto L37
            boolean r5 = r5.m976g0()
            if (r5 == 0) goto L54
        L37:
            com.github.catvod.spider.merge.a0.s r5 = r4.f558a
            r2 = 0
            if (r5 != 0) goto L3d
            goto L50
        L3d:
            int r3 = r4.f559b
            if (r3 <= 0) goto L50
            java.util.List r5 = r5.mo918n()
            int r2 = r4.f559b
            int r2 = r2 + (-1)
            java.lang.Object r5 = r5.get(r2)
            r2 = r5
            com.github.catvod.spider.merge.a0.s r2 = (com.github.catvod.spider.merge.p025a0.AbstractC0299s) r2
        L50:
            if (r2 == 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = 0
        L55:
            if (r5 != 0) goto L58
            goto L59
        L58:
            r0 = 0
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p025a0.C0293m.m965r0(com.github.catvod.spider.merge.a0.g):boolean");
    }

    /* renamed from: s0 */
    public final C0459g m964s0() {
        AbstractC0299s abstractC0299s = this.f558a;
        if (abstractC0299s == null) {
            return new C0459g(0);
        }
        List<C0293m> m987U = ((C0293m) abstractC0299s).m987U();
        C0459g c0459g = new C0459g(m987U.size() - 1);
        for (C0293m c0293m : m987U) {
            if (c0293m != this) {
                c0459g.add(c0293m);
            }
        }
        return c0459g;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: t */
    public String mo900t() {
        return this.f539d.m844b();
    }

    /* renamed from: t0 */
    public final C0323G m963t0() {
        return this.f539d;
    }

    /* renamed from: u0 */
    public final String m962u0() {
        return this.f539d.m844b();
    }

    /* renamed from: v0 */
    public C0293m mo961v0(String str) {
        C0277c.m1063l(str);
        this.f541f.clear();
        C0288h m910y = m910y();
        m995M((m910y == null || !m910y.m1007D0().m848b(m973j0())) ? new C0302v(str) : new C0286f(str));
        return this;
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: w */
    void mo899w(Appendable appendable, int i, C0287g c0287g) {
        if (m965r0(c0287g) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            m914r(appendable, i, c0287g);
        }
        appendable.append('<').append(m962u0());
        C0283c c0283c = this.f542g;
        if (c0283c != null) {
            c0283c.m1029p(appendable, c0287g);
        }
        if (this.f541f.isEmpty() && this.f539d.m837i() && (c0287g.m1011h() != 1 || !this.f539d.m842d())) {
            appendable.append(atm.m897d("4A5544"));
        } else {
            appendable.append('>');
        }
    }

    /* renamed from: w0 */
    public final String m960w0() {
        StringBuilder m1058b = C0280b.m1058b();
        C0441O.m622c(new C0291k(m1058b), this);
        return C0280b.m1052h(m1058b).trim();
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: x */
    void mo898x(Appendable appendable, int i, C0287g c0287g) {
        if (this.f541f.isEmpty() && this.f539d.m837i()) {
            return;
        }
        if (c0287g.m1012g() && !this.f541f.isEmpty() && this.f539d.m845a()) {
            m914r(appendable, i, c0287g);
        }
        appendable.append(atm.m897d("5655")).append(m962u0()).append('>');
    }

    /* renamed from: x0 */
    public final List<C0302v> m959x0() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0299s abstractC0299s : this.f541f) {
            if (abstractC0299s instanceof C0302v) {
                arrayList.add((C0302v) abstractC0299s);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: y0 */
    public final String m958y0() {
        StringBuilder m1058b = C0280b.m1058b();
        int mo903h = mo903h();
        for (int i = 0; i < mo903h; i++) {
            m990R(this.f541f.get(i), m1058b);
        }
        return C0280b.m1052h(m1058b);
    }

    @Override // com.github.catvod.spider.merge.p025a0.AbstractC0299s
    /* renamed from: z */
    public final AbstractC0299s mo909z() {
        return (C0293m) this.f558a;
    }

    public C0293m(String str) {
        this(C0323G.m833m(str, C0319E.f665d), "", null);
    }
}
