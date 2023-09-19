package com.github.catvod.spider;

import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p026b.C0304b;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p054p.C0642b;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Doll extends Spider {
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        ArrayList arrayList = new ArrayList();
        boolean equals = str2.equals(atm.m897d("5B"));
        String m897d = atm.m897d("020E0E053F624555121A223F01151412283706160C1C283D0554191A2177");
        if (equals) {
            str3 = C0642b.m156a(m897d, str);
        } else {
            str3 = m897d + str + atm.m897d("45") + str2 + atm.m897d("44120E1820");
        }
        Iterator<C0293m> it = C0052e.m1414e(C0574b.m307f(str3, null, null)).m967p0(atm.m897d("0E130C5B3A310E1F1558283D1E1B1319")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String m897d2 = atm.m897d("02495403253C0F155701252C061F5A4B6C39");
            String replace = next.m967p0(m897d2).m606a(atm.m897d("02081F13")).replace(m897d, "");
            String m602e = next.m967p0(m897d2).m602e();
            StringBuilder m635a = C0424a.m635a(m897d);
            m635a.append(next.m967p0(atm.m897d("0E130C5B38301F17185572780B5A445525350D")).m606a(atm.m897d("0E1B0E14612B1819")));
            arrayList.add(new C0310h(replace, m602e, m635a.toString(), next.m967p0(atm.m897d("0E130C5B28391E1F")).m602e()));
        }
        return C0308f.m887h(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F624555121A223F01151412283706160C1C283D0554191A2177"));
        m635a.append(list.get(0));
        String m307f = C0574b.m307f(m635a.toString(), null, null);
        C0288h m1414e = C0052e.m1414e(m307f);
        StringBuilder sb = new StringBuilder();
        String str = list.get(0).split(atm.m897d("45"))[1].split(atm.m897d("3654"))[0];
        C0459g m967p0 = m1414e.m967p0(atm.m897d("071F0E14172818150A103E2C134715127631071B1D1011"));
        String m897d = atm.m897d("0915140129361E");
        String m606a = m967p0.m606a(m897d);
        String m606a2 = m1414e.m967p0(atm.m897d("071F0E14172818150A103E2C13471512762C030E161011")).m606a(m897d);
        String str2 = new String(Base64.decode(C0652d.m145f(m307f, atm.m897d("1C150E1018390D")).getBytes(), 0));
        for (int i = 0; i < str2.length(); i++) {
            sb.append(Character.toChars(str2.charAt(i) ^ str.charAt(i % str.length())));
        }
        String decode = URLDecoder.decode(new String(Base64.decode(sb.toString().getBytes(), 0)));
        C0310h c0310h = new C0310h();
        c0310h.m868g(list.get(0));
        c0310h.m866i(m606a);
        c0310h.m867h(m606a2);
        c0310h.m865j(atm.m897d("8DF4D390CDEE8FDDEA90EBC8"));
        c0310h.m864k(atm.m897d("8CE8D793D8E64E") + decode);
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        String m897d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String m897d2 = atm.m897d("020E0E053F624555121A223F01151412283706160C1C283D0554191A2177");
        C0288h m1414e = C0052e.m1414e(C0574b.m307f(m897d2, null, null));
        Iterator<C0293m> it = m1414e.m967p0(atm.m897d("1F165906253C0F571710222D")).get(0).m967p0(atm.m897d("06135A4B6C39")).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            m897d = atm.m897d("02081F13");
            if (!hasNext) {
                break;
            }
            C0293m next = it.next();
            arrayList.add(new C0304b(next.mo925d(m897d).replace(m897d2, ""), next.m960w0()));
        }
        Iterator<C0293m> it2 = m1414e.m967p0(atm.m897d("0E130C5B3A310E1F1558283D1E1B1319")).iterator();
        while (it2.hasNext()) {
            C0293m next2 = it2.next();
            String m897d3 = atm.m897d("02495403253C0F155701252C061F5A4B6C39");
            String replace = next2.m967p0(m897d3).m606a(m897d).replace(m897d2, "");
            String m602e = next2.m967p0(m897d3).m602e();
            StringBuilder m635a = C0424a.m635a(m897d2);
            m635a.append(next2.m967p0(atm.m897d("0E130C5B38301F17185572780B5A445525350D")).m606a(atm.m897d("0E1B0E14612B1819")));
            arrayList2.add(new C0310h(replace, m602e, m635a.toString(), next2.m967p0(atm.m897d("0E130C5B28391E1F")).m602e()));
        }
        return C0308f.m885j(arrayList, arrayList2);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0308f c0308f = new C0308f();
        c0308f.m880o(str2);
        return c0308f.toString();
    }
}
