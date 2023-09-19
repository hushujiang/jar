package com.github.catvod.spider.merge.p019T;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p018S.C0201b;
import com.github.catvod.spider.merge.p018S.C0203d;
import com.github.catvod.spider.merge.p018S.C0207h;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.github.catvod.spider.merge.T.i */
/* loaded from: classes.dex */
public abstract class AbstractC0218i implements Serializable {

    /* renamed from: q */
    public static final AbstractC0218i f369q = new C0211b();

    /* renamed from: r */
    private static final ThreadLocal<WeakHashMap<Object, Object>> f370r;

    /* renamed from: c */
    private boolean f373c;

    /* renamed from: h */
    private boolean f378h;

    /* renamed from: n */
    private String f384n;

    /* renamed from: o */
    private String f385o;

    /* renamed from: p */
    private String f386p;

    /* renamed from: a */
    private boolean f371a = true;

    /* renamed from: b */
    private boolean f372b = true;

    /* renamed from: d */
    private boolean f374d = true;

    /* renamed from: e */
    private String f375e = atm.m897d("31");

    /* renamed from: f */
    private String f376f = atm.m897d("37");

    /* renamed from: g */
    private String f377g = atm.m897d("57");

    /* renamed from: i */
    private String f379i = atm.m897d("46");

    /* renamed from: j */
    private String f380j = atm.m897d("11");

    /* renamed from: k */
    private String f381k = atm.m897d("17");

    /* renamed from: l */
    private String f382l = atm.m897d("56140F192066");

    /* renamed from: m */
    private String f383m = atm.m897d("5609130F2965");

    static {
        new C0213d();
        new C0215f();
        new C0216g();
        new C0217h();
        new C0214e();
        new C0212c();
        f370r = new ThreadLocal<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0218i() {
        String m897d = atm.m897d("54");
        this.f384n = m897d;
        this.f385o = atm.m897d("56");
        this.f386p = m897d;
    }

    /* renamed from: L */
    static void m1150L(Object obj) {
        Map<Object, Object> m1130t;
        if (obj == null || (m1130t = m1130t()) == null) {
            return;
        }
        m1130t.remove(obj);
        if (m1130t.isEmpty()) {
            f370r.remove();
        }
    }

    /* renamed from: t */
    static Map<Object, Object> m1130t() {
        return f370r.get();
    }

    /* renamed from: u */
    static void m1129u(Object obj) {
        if (obj != null) {
            if (m1130t() == null) {
                f370r.set(new WeakHashMap<>());
            }
            m1130t().put(obj, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final void m1161A(String str) {
        if (str == null) {
            str = "";
        }
        this.f379i = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final void m1160B() {
        this.f378h = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final void m1159C() {
        this.f382l = atm.m897d("040F1619");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final void m1158D() {
        this.f384n = atm.m897d("5458");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final void m1157E() {
        this.f383m = atm.m897d("4846091C363D57");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public final void m1156F() {
        this.f386p = atm.m897d("5458");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G */
    public final void m1155G() {
        this.f385o = atm.m897d("4846");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final void m1154H() {
        this.f372b = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final void m1153I() {
        this.f371a = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public final void m1152J() {
        this.f374d = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public final void m1151K() {
        this.f373c = true;
    }

    /* renamed from: a */
    public void mo1149a(StringBuffer stringBuffer, Object obj) {
        String m897d = atm.m897d("1C1B160029");
        mo1140j(stringBuffer, m897d);
        if (obj == null) {
            stringBuffer.append(this.f382l);
        } else {
            m1139k(stringBuffer, m897d, obj, true);
        }
        stringBuffer.append(this.f379i);
    }

    /* renamed from: b */
    public final void m1148b(StringBuffer stringBuffer, String str, boolean z) {
        mo1140j(stringBuffer, str);
        stringBuffer.append(z);
        stringBuffer.append(this.f379i);
    }

    /* renamed from: c */
    protected void mo1147c(StringBuffer stringBuffer, char c) {
        stringBuffer.append(c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m1146d(StringBuffer stringBuffer, String str, int i, Object obj) {
        if (i > 0) {
            stringBuffer.append(atm.m897d("46"));
        }
        if (obj == null) {
            stringBuffer.append(this.f382l);
        } else {
            m1139k(stringBuffer, str, obj, true);
        }
    }

    /* renamed from: e */
    protected void mo1145e(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    /* renamed from: f */
    protected void mo1144f(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    /* renamed from: g */
    protected void mo1143g(StringBuffer stringBuffer, Map map) {
        stringBuffer.append(map);
    }

    /* renamed from: h */
    public final void m1142h(StringBuffer stringBuffer, Object obj) {
        if (C0207h.m1174a(stringBuffer, this.f379i)) {
            stringBuffer.setLength(stringBuffer.length() - this.f379i.length());
        }
        stringBuffer.append(this.f376f);
        m1150L(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m1141i(StringBuffer stringBuffer) {
        stringBuffer.append(this.f379i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void mo1140j(StringBuffer stringBuffer, String str) {
        if (!this.f371a || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f377g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final void m1139k(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        int size;
        Map<Object, Object> m1130t = m1130t();
        int i = 0;
        if ((m1130t != null && m1130t.containsKey(obj)) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            C0203d.m1176a(stringBuffer, obj);
            return;
        }
        m1129u(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    mo1144f(stringBuffer, str, (Collection) obj);
                } else {
                    size = ((Collection) obj).size();
                    m1136n(stringBuffer, size);
                }
            } else if (!(obj instanceof Map)) {
                boolean z2 = obj instanceof long[];
                String m897d = atm.m897d("46");
                if (z2) {
                    if (z) {
                        long[] jArr = (long[]) obj;
                        stringBuffer.append(this.f380j);
                        while (i < jArr.length) {
                            if (i > 0) {
                                stringBuffer.append(m897d);
                            }
                            stringBuffer.append(jArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.f381k);
                    } else {
                        m1136n(stringBuffer, ((long[]) obj).length);
                    }
                } else if (obj instanceof int[]) {
                    if (z) {
                        int[] iArr = (int[]) obj;
                        stringBuffer.append(this.f380j);
                        while (i < iArr.length) {
                            if (i > 0) {
                                stringBuffer.append(m897d);
                            }
                            stringBuffer.append(iArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.f381k);
                    } else {
                        m1136n(stringBuffer, ((int[]) obj).length);
                    }
                } else if (obj instanceof short[]) {
                    if (z) {
                        short[] sArr = (short[]) obj;
                        stringBuffer.append(this.f380j);
                        while (i < sArr.length) {
                            if (i > 0) {
                                stringBuffer.append(m897d);
                            }
                            stringBuffer.append((int) sArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.f381k);
                    } else {
                        m1136n(stringBuffer, ((short[]) obj).length);
                    }
                } else if (obj instanceof byte[]) {
                    if (z) {
                        byte[] bArr = (byte[]) obj;
                        stringBuffer.append(this.f380j);
                        while (i < bArr.length) {
                            if (i > 0) {
                                stringBuffer.append(m897d);
                            }
                            stringBuffer.append((int) bArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.f381k);
                    } else {
                        m1136n(stringBuffer, ((byte[]) obj).length);
                    }
                } else if (obj instanceof char[]) {
                    if (z) {
                        char[] cArr = (char[]) obj;
                        stringBuffer.append(this.f380j);
                        while (i < cArr.length) {
                            if (i > 0) {
                                stringBuffer.append(m897d);
                            }
                            mo1147c(stringBuffer, cArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.f381k);
                    } else {
                        m1136n(stringBuffer, ((char[]) obj).length);
                    }
                } else if (obj instanceof double[]) {
                    if (z) {
                        double[] dArr = (double[]) obj;
                        stringBuffer.append(this.f380j);
                        while (i < dArr.length) {
                            if (i > 0) {
                                stringBuffer.append(m897d);
                            }
                            stringBuffer.append(dArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.f381k);
                    } else {
                        m1136n(stringBuffer, ((double[]) obj).length);
                    }
                } else if (obj instanceof float[]) {
                    if (z) {
                        float[] fArr = (float[]) obj;
                        stringBuffer.append(this.f380j);
                        while (i < fArr.length) {
                            if (i > 0) {
                                stringBuffer.append(m897d);
                            }
                            stringBuffer.append(fArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.f381k);
                    } else {
                        m1136n(stringBuffer, ((float[]) obj).length);
                    }
                } else if (obj instanceof boolean[]) {
                    if (z) {
                        boolean[] zArr = (boolean[]) obj;
                        stringBuffer.append(this.f380j);
                        while (i < zArr.length) {
                            if (i > 0) {
                                stringBuffer.append(m897d);
                            }
                            stringBuffer.append(zArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.f381k);
                    } else {
                        m1136n(stringBuffer, ((boolean[]) obj).length);
                    }
                } else if (obj.getClass().isArray()) {
                    if (z) {
                        Object[] objArr = (Object[]) obj;
                        stringBuffer.append(this.f380j);
                        while (i < objArr.length) {
                            Object obj2 = objArr[i];
                            if (i > 0) {
                                stringBuffer.append(m897d);
                            }
                            if (obj2 == null) {
                                stringBuffer.append(this.f382l);
                            } else {
                                m1139k(stringBuffer, str, obj2, true);
                            }
                            i++;
                        }
                        stringBuffer.append(this.f381k);
                    } else {
                        m1136n(stringBuffer, ((Object[]) obj).length);
                    }
                } else if (z) {
                    mo1145e(stringBuffer, str, obj);
                } else {
                    stringBuffer.append(this.f385o);
                    stringBuffer.append(C0201b.m1178a(obj.getClass()));
                    stringBuffer.append(this.f386p);
                }
            } else if (z) {
                mo1143g(stringBuffer, (Map) obj);
            } else {
                size = ((Map) obj).size();
                m1136n(stringBuffer, size);
            }
        } finally {
            m1150L(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final void m1138l(StringBuffer stringBuffer) {
        stringBuffer.append(this.f382l);
    }

    /* renamed from: m */
    public final void m1137m(StringBuffer stringBuffer, Object obj) {
        String name;
        if (obj != null) {
            if (this.f372b) {
                m1129u(obj);
                boolean z = this.f373c;
                Class<?> cls = obj.getClass();
                if (z) {
                    name = C0201b.m1178a(cls);
                } else {
                    name = cls.getName();
                }
                stringBuffer.append(name);
            }
            if (this.f374d) {
                m1129u(obj);
                stringBuffer.append('@');
                stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            }
            stringBuffer.append(this.f375e);
            if (this.f378h) {
                stringBuffer.append(this.f379i);
            }
        }
    }

    /* renamed from: n */
    protected final void m1136n(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.f383m);
        stringBuffer.append(i);
        stringBuffer.append(this.f384n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final String m1135o() {
        return this.f381k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final String m1134p() {
        return this.f380j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final String m1133q() {
        return this.f376f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final String m1132r() {
        return this.f375e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final String m1131s() {
        return this.f382l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final void m1128v() {
        this.f381k = atm.m897d("37");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final void m1127w() {
        this.f380j = atm.m897d("31");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final void m1126x(String str) {
        if (str == null) {
            str = "";
        }
        this.f376f = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final void m1125y(String str) {
        this.f375e = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final void m1124z() {
        this.f377g = atm.m897d("50");
    }
}
