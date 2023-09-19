package com.github.catvod.spider;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p026b.C0304b;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p027b0.C0321F;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p054p.C0642b;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Supjav extends Spider {
    /* renamed from: a */
    private HashMap<String, String> m1533a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(atm.m897d("3F091F0761190D1F1401"), atm.m897d("2715001C20340B554F5B7C78422D131B28371D095A3B18785B4A544577783D13144378634A024C4165782B0A0A19290F0F18311C38775F494D5B7F6E4A52313D181526565A1925330F5A3D102F3305535A36242A05171F5A7D6853544A5B7C765A5A29142A39181355407F6F44494C"));
        hashMap.put(atm.m897d("381F1C103E3D18"), str);
        return hashMap;
    }

    /* renamed from: b */
    private HashMap<String, String> m1532b() {
        return m1533a(atm.m897d("020E0E053F62455509003C320B0C541623354500125A"));
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0293m> it = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F62455509003C320B0C541623354500125A") + str + atm.m897d("450A1B122977") + str2, m1532b(), null)).m967p0(atm.m897d("0E130C5B3C37190E")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String m606a = next.m967p0(atm.m897d("03171D")).m606a(atm.m897d("0E1B0E14613718131D1C223906"));
            String m897d = atm.m897d("0B");
            String m606a2 = next.m967p0(m897d).m606a(atm.m897d("02081F13"));
            arrayList.add(new C0310h(m606a2.split(atm.m897d("45"))[4], next.m967p0(m897d).m606a(atm.m897d("1E130E1929")), m606a));
        }
        return C0308f.m887h(arrayList);
    }

    public String detailContent(List<String> list) {
        C0288h m846d = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F62455509003C320B0C541623354500125A").concat(list.get(0)), m1532b(), null));
        String m897d = atm.m897d("0E130C5B3C37190E5718292C0B5A445525350D");
        String m606a = m846d.m967p0(m897d).m606a(atm.m897d("0B160E"));
        String m606a2 = m846d.m967p0(m897d).m606a(atm.m897d("190819"));
        String m602e = m846d.m967p0(atm.m897d("1A5419143878545A1B")).m602e();
        Iterator<C0293m> it = m846d.m967p0(atm.m897d("0E130C5B2F391E095A4B6C28")).iterator();
        String str = "";
        String str2 = "";
        while (it.hasNext()) {
            C0293m next = it.next();
            String m897d2 = atm.m897d("190A1B1B");
            boolean contains = next.m967p0(m897d2).m602e().contains(atm.m897d("271B11103E"));
            String m897d3 = atm.m897d("0B");
            if (contains) {
                str2 = next.m967p0(m897d3).m602e();
            }
            if (next.m967p0(m897d2).m602e().contains(atm.m897d("291B0901"))) {
                str = next.m967p0(m897d3).m602e();
            }
        }
        C0310h c0310h = new C0310h();
        c0310h.m868g(list.get(0));
        c0310h.m866i(m606a2);
        c0310h.m867h(m606a);
        c0310h.m872c(str);
        c0310h.m869f(str2);
        c0310h.m873b(m602e);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0459g m967p0 = m846d.m967p0(atm.m897d("0B5418012275191F0803292A"));
        for (int i = 0; i < m967p0.size(); i++) {
            C0293m c0293m = m967p0.get(i);
            String m960w0 = c0293m.m960w0();
            if (!m960w0.equals(atm.m897d("202A3B"))) {
                String mo925d = c0293m.mo925d(atm.m897d("0E1B0E146134031411"));
                linkedHashMap.put(m960w0, atm.m897d("8CE8D793D8E64E") + mo925d);
            }
        }
        if (linkedHashMap.size() > 0) {
            Set keySet = linkedHashMap.keySet();
            String m897d4 = atm.m897d("4E5E5E");
            c0310h.m865j(TextUtils.join(m897d4, keySet));
            c0310h.m864k(TextUtils.join(m897d4, linkedHashMap.values()));
        }
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        String m897d;
        String m897d2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap<String, String> m1532b = m1532b();
        String m897d3 = atm.m897d("020E0E053F62455509003C320B0C541623354500125A");
        C0288h m846d = C0321F.m846d(C0574b.m307f(m897d3, m1532b, null));
        Iterator<C0293m> it = m846d.m967p0(atm.m897d("1F16541B2D2E4A445A192578545A1B")).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            m897d = atm.m897d("45");
            m897d2 = atm.m897d("02081F13");
            if (!hasNext) {
                break;
            }
            C0293m next = it.next();
            String mo925d = next.mo925d(m897d2);
            if (mo925d.split(m897d).length >= 5) {
                arrayList2.add(new C0304b(mo925d.replace(m897d3, ""), next.m960w0()));
            }
        }
        Iterator<C0293m> it2 = m846d.m967p0(atm.m897d("0E130C5B3C37190E")).iterator();
        while (it2.hasNext()) {
            C0293m next2 = it2.next();
            String m897d4 = atm.m897d("03171D");
            String m606a = next2.m967p0(m897d4).m606a(atm.m897d("190819"));
            String m606a2 = next2.m967p0(m897d4).m606a(atm.m897d("0E1B0E14613718131D1C223906"));
            String m897d5 = atm.m897d("0B");
            String m606a3 = next2.m967p0(m897d5).m606a(m897d2);
            String m606a4 = next2.m967p0(m897d5).m606a(atm.m897d("1E130E1929"));
            if (!TextUtils.isEmpty(m606a2)) {
                m606a = m606a2;
            }
            arrayList.add(new C0310h(m606a3.split(m897d)[4], m606a4, m606a));
        }
        return C0308f.m885j(arrayList2, arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        char c;
        HashMap hashMap;
        String[] split;
        HashMap hashMap2 = new HashMap();
        StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F624555161E7D76190F0A0729350F101B03623B051755063928001B0C5B3C301A451948"));
        m635a.append((Object) new StringBuilder(str2).reverse());
        String sb = m635a.toString();
        String m897d = atm.m897d("020E0E053F624555161E7D76190F0A0729350F101B03623B051755");
        C0574b.m305h(sb, m1533a(m897d), hashMap2);
        String m311b = C0574b.m311b(hashMap2);
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode == 2191) {
            if (str.equals(atm.m897d("2E29"))) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 2657) {
            if (hashCode == 2690 && str.equals(atm.m897d("3E2C"))) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals(atm.m897d("392E"))) {
                c = 1;
            }
            c = 65535;
        }
        String m897d2 = atm.m897d("4D");
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    C0308f c0308f = new C0308f();
                    c0308f.m880o(str2);
                    c0308f.m889f();
                    return c0308f.toString();
                }
                String m307f = C0574b.m307f(m311b, m1533a(m897d), null);
                C0308f c0308f2 = new C0308f();
                c0308f2.m880o(C0652d.m145f(m307f, atm.m897d("1F081625203913")));
                c0308f2.m892c(m1533a(m311b));
                return c0308f2.toString();
            }
            HashMap hashMap3 = new HashMap();
            String m307f2 = C0574b.m307f(m311b, m1533a(m897d), null);
            String m960w0 = C0321F.m846d(m307f2).m982a0(atm.m897d("1815181A3834031411")).m960w0();
            String m897d3 = atm.m897d("4C0E151E293657");
            String substring = m960w0.substring(0, m960w0.indexOf(m897d3) + 7);
            for (String str3 : m307f2.split(m897d3)) {
                if (str3.contains(atm.m897d("4D535406393A190E081C223F42"))) {
                    C0574b.m305h(atm.m897d("020E0E053F6245") + substring + str3.split(m897d2)[0] + atm.m897d("4C090E07293907474B"), m1533a(m311b), hashMap3);
                    String m311b2 = C0574b.m311b(hashMap3);
                    C0308f c0308f3 = new C0308f();
                    c0308f3.m880o(m311b2);
                    c0308f3.m892c(m1533a(m311b));
                    return c0308f3.toString();
                }
            }
            return "";
        }
        StringBuilder m635a2 = C0424a.m635a(atm.m897d("020E0E053F624555"));
        m635a2.append(Uri.parse(m311b).getHost());
        String sb2 = m635a2.toString();
        C0574b.m305h(m311b, m1533a(m897d), new HashMap());
        String str4 = sb2 + C0574b.m311b(hashMap);
        for (String str5 : C0574b.m307f(str4, m1532b(), null).split(m897d2)) {
            if (str5.startsWith(atm.m897d("450A1B063F07071E4F5A"))) {
                String str6 = str5.split(atm.m897d("45"))[3];
                StringBuilder m635a3 = C0424a.m635a(C0574b.m307f(C0642b.m156a(sb2, str5), m1533a(str4), null));
                StringBuilder sb3 = new StringBuilder();
                for (int i = 0; i < 10; i++) {
                    double random = Math.random();
                    double d = 62;
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    sb3.append(atm.m897d("2B383931091E2D32333F0714273435251D0A392E2F231B0033201B172F3C0F1C1D1D25320116171B23281B080901392E1D02030F7C6958494E407A6F5243").charAt((int) Math.floor(random * d)));
                }
                m635a3.append(sb3.toString());
                m635a3.append(atm.m897d("550E151E293657"));
                m635a3.append(str6);
                m635a3.append(atm.m897d("4C1F0205252A1347"));
                m635a3.append(System.currentTimeMillis());
                String sb4 = m635a3.toString();
                C0308f c0308f4 = new C0308f();
                c0308f4.m880o(sb4);
                c0308f4.m892c(m1533a(str4));
                return c0308f4.toString();
            }
        }
        return "";
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0293m> it = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F62455509003C320B0C541623354500125A").concat(atm.m897d("550947")).concat(URLEncoder.encode(str)), m1532b(), null)).m967p0(atm.m897d("0E130C5B3C37190E")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String m606a = next.m967p0(atm.m897d("03171D")).m606a(atm.m897d("0E1B0E14613718131D1C223906"));
            String m897d = atm.m897d("0B");
            String m606a2 = next.m967p0(m897d).m606a(atm.m897d("02081F13"));
            arrayList.add(new C0310h(m606a2.split(atm.m897d("45"))[4], next.m967p0(m897d).m606a(atm.m897d("1E130E1929")), m606a));
        }
        return C0308f.m887h(arrayList);
    }
}
