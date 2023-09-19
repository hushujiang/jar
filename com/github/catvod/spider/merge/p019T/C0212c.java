package com.github.catvod.spider.merge.p019T;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p018S.C0206g;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.T.c */
/* loaded from: classes.dex */
final class C0212c extends AbstractC0218i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0212c() {
        m1154H();
        m1152J();
        m1125y(atm.m897d("11"));
        m1126x(atm.m897d("17"));
        m1127w();
        m1128v();
        m1161A(atm.m897d("46"));
        m1124z();
        m1159C();
        m1155G();
        m1156F();
        m1157E();
        m1158D();
    }

    @Override // com.github.catvod.spider.merge.p019T.AbstractC0218i
    /* renamed from: a */
    public final void mo1149a(StringBuffer stringBuffer, Object obj) {
        super.mo1149a(stringBuffer, obj);
    }

    @Override // com.github.catvod.spider.merge.p019T.AbstractC0218i
    /* renamed from: c */
    protected final void mo1147c(StringBuffer stringBuffer, char c) {
        String valueOf = String.valueOf(c);
        stringBuffer.append('\"');
        stringBuffer.append(C0206g.m1175a(valueOf));
        stringBuffer.append('\"');
    }

    @Override // com.github.catvod.spider.merge.p019T.AbstractC0218i
    /* renamed from: e */
    protected final void mo1145e(StringBuffer stringBuffer, String str, Object obj) {
        if (obj == null) {
            m1138l(stringBuffer);
        } else if ((obj instanceof String) || (obj instanceof Character)) {
            String obj2 = obj.toString();
            stringBuffer.append('\"');
            stringBuffer.append(C0206g.m1175a(obj2));
            stringBuffer.append('\"');
        } else if ((obj instanceof Number) || (obj instanceof Boolean)) {
            stringBuffer.append(obj);
        } else {
            String obj3 = obj.toString();
            boolean z = false;
            if (!(obj3.startsWith(m1132r()) && obj3.endsWith(m1133q()))) {
                if (obj3.startsWith(m1134p()) && obj3.endsWith(m1135o())) {
                    z = true;
                }
                if (!z) {
                    mo1145e(stringBuffer, str, obj3);
                    return;
                }
            }
            stringBuffer.append(obj);
        }
    }

    @Override // com.github.catvod.spider.merge.p019T.AbstractC0218i
    /* renamed from: f */
    protected final void mo1144f(StringBuffer stringBuffer, String str, Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            stringBuffer.append(collection);
            return;
        }
        stringBuffer.append(m1134p());
        int i = 0;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            m1146d(stringBuffer, str, i, it.next());
            i++;
        }
        stringBuffer.append(m1135o());
    }

    @Override // com.github.catvod.spider.merge.p019T.AbstractC0218i
    /* renamed from: g */
    protected final void mo1143g(StringBuffer stringBuffer, Map map) {
        if (map == null || map.isEmpty()) {
            stringBuffer.append(map);
            return;
        }
        stringBuffer.append(m1132r());
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String obj = key != null ? key.toString() : null;
            if (obj != null) {
                if (z) {
                    z = false;
                } else {
                    m1141i(stringBuffer);
                }
                mo1140j(stringBuffer, obj);
                Object value = entry.getValue();
                if (value == null) {
                    m1138l(stringBuffer);
                } else {
                    m1139k(stringBuffer, obj, value, true);
                }
            }
        }
        stringBuffer.append(m1133q());
    }

    @Override // com.github.catvod.spider.merge.p019T.AbstractC0218i
    /* renamed from: j */
    protected final void mo1140j(StringBuffer stringBuffer, String str) {
        String m897d = atm.m897d("48");
        StringBuilder m635a = C0424a.m635a(m897d);
        m635a.append(C0206g.m1175a(str));
        m635a.append(m897d);
        super.mo1140j(stringBuffer, m635a.toString());
    }
}
