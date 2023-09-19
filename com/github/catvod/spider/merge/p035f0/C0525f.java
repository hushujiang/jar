package com.github.catvod.spider.merge.p035f0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p018S.C0207h;
import com.github.catvod.spider.merge.p019T.C0210a;
import com.github.catvod.spider.merge.p021W.C0248a;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p043j0.C0584e;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.f0.f */
/* loaded from: classes.dex */
public final class C0525f implements Comparable<C0525f> {

    /* renamed from: a */
    private Object f947a;

    /* renamed from: b */
    private boolean f948b = false;

    /* renamed from: c */
    private boolean f949c = false;

    public C0525f(Object obj) {
        this.f947a = obj;
    }

    /* renamed from: a */
    public final Boolean m451a() {
        Object obj = this.f947a;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return Boolean.valueOf((obj == null || C0207h.m1173b(m445g())) ? false : true);
    }

    /* renamed from: b */
    public final Date m450b() {
        Object obj = this.f947a;
        boolean z = obj instanceof String;
        String m897d = atm.m897d("091B09016C2C055A1E14383D4A1C1B1C20764A0C1B192978575A");
        if (z) {
            try {
                return C0248a.f446a.m1095c((String) obj);
            } catch (ParseException unused) {
                StringBuilder m635a = C0424a.m635a(m897d);
                m635a.append(this.f947a);
                throw new C0584e(m635a.toString());
            }
        } else if (obj instanceof Date) {
            return (Date) obj;
        } else {
            StringBuilder m635a2 = C0424a.m635a(m897d);
            m635a2.append(this.f947a);
            throw new C0584e(m635a2.toString());
        }
    }

    /* renamed from: c */
    public final Double m449c() {
        double doubleValue;
        Object obj = this.f947a;
        if (obj instanceof String) {
            doubleValue = new BigDecimal((String) this.f947a).doubleValue();
        } else if (!(obj instanceof Number)) {
            StringBuilder m635a = C0424a.m635a(atm.m897d("091B09016C2C055A1400213A0F085A132D3106545A032D340F5A4755"));
            m635a.append(this.f947a);
            throw new C0584e(m635a.toString());
        } else {
            doubleValue = ((Number) obj).doubleValue();
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: d */
    public final C0459g m448d() {
        return (C0459g) this.f947a;
    }

    /* renamed from: e */
    public final List<String> m447e() {
        return (List) this.f947a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0525f.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f947a;
        Object obj3 = ((C0525f) obj).f947a;
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    /* renamed from: f */
    public final Long m446f() {
        long longValue;
        Object obj = this.f947a;
        if (obj instanceof String) {
            longValue = new BigDecimal((String) this.f947a).setScale(0, 4).longValue();
        } else if (!(obj instanceof Number)) {
            StringBuilder m635a = C0424a.m635a(atm.m897d("091B09016C2C055A1400213A0F085A132D3106545A032D340F5A4755"));
            m635a.append(this.f947a);
            throw new C0584e(m635a.toString());
        } else {
            longValue = ((Number) obj).longValue();
        }
        return Long.valueOf(longValue);
    }

    /* renamed from: g */
    public final String m445g() {
        Object obj = this.f947a;
        if (obj instanceof C0459g) {
            StringBuilder sb = new StringBuilder();
            Iterator<C0293m> it = ((C0459g) this.f947a).iterator();
            while (it.hasNext()) {
                sb.append(it.next().m972k0());
            }
            return sb.toString();
        }
        if (obj instanceof C0293m) {
            String m962u0 = ((C0293m) obj).m962u0();
            String m897d = atm.m897d("2022252109003E");
            if (m962u0 == m897d || (m962u0 != null && m962u0.equals(m897d))) {
                return ((C0293m) this.f947a).m972k0();
            }
        }
        Object obj2 = this.f947a;
        return obj2 instanceof List ? C0207h.m1170e((List) obj2, atm.m897d("46")) : String.valueOf(obj2).trim();
    }

    /* renamed from: h */
    public final C0525f m444h() {
        this.f948b = true;
        return this;
    }

    public final int hashCode() {
        Object obj = this.f947a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public final int compareTo(C0525f c0525f) {
        if (equals(c0525f)) {
            return 0;
        }
        if (c0525f == null || c0525f.f947a == null) {
            return 1;
        }
        Object obj = this.f947a;
        if (obj == null) {
            return -1;
        }
        if (obj instanceof String) {
            return m445g().compareTo(c0525f.m445g());
        }
        if (obj instanceof Number) {
            return m449c().compareTo(c0525f.m449c());
        }
        StringBuilder m635a = C0424a.m635a(atm.m897d("3F1409003C2805080E102878091517052D2A0B1816106C003C1B16002978575A"));
        m635a.append(toString());
        throw new C0584e(m635a.toString());
    }

    /* renamed from: j */
    public final C0525f m442j() {
        this.f949c = true;
        String valueOf = String.valueOf(this.f947a);
        String m897d = atm.m897d("4D");
        String m1168g = C0207h.m1168g(valueOf, m897d);
        String m897d2 = atm.m897d("48");
        this.f947a = C0207h.m1169f(C0207h.m1169f(C0207h.m1168g(m1168g, m897d2), m897d), m897d2);
        return this;
    }

    /* renamed from: k */
    public final boolean m441k() {
        return this.f948b;
    }

    /* renamed from: l */
    public final boolean m440l() {
        return this.f947a instanceof Boolean;
    }

    /* renamed from: m */
    public final boolean m439m() {
        return this.f947a instanceof Date;
    }

    /* renamed from: n */
    public final boolean m438n() {
        return this.f947a instanceof C0459g;
    }

    /* renamed from: o */
    public final boolean m437o() {
        return this.f949c;
    }

    /* renamed from: p */
    public final boolean m436p() {
        return this.f947a instanceof List;
    }

    /* renamed from: q */
    public final boolean m435q() {
        return this.f947a instanceof Number;
    }

    /* renamed from: r */
    public final boolean m434r() {
        return this.f947a instanceof String;
    }

    /* renamed from: s */
    public final Class m433s() {
        Object obj = this.f947a;
        return obj == null ? Object.class : obj.getClass();
    }

    public final String toString() {
        C0210a c0210a = new C0210a(this);
        c0210a.m1163a(this.f947a);
        c0210a.m1162b(atm.m897d("03093B01382A"), this.f948b);
        c0210a.m1162b(atm.m897d("03093F0D3C2A390E08"), this.f949c);
        return c0210a.toString();
    }
}
