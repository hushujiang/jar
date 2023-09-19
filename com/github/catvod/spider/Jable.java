package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p026b.C0304b;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p027b0.C0321F;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class Jable extends Spider {
    /* renamed from: a */
    private HashMap<String, String> m1536a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(atm.m897d("3F091F0761190D1F1401"), atm.m897d("2715001C20340B554F5B7C78422D131B28371D095A3B18785B4A544577783D13144378634A024C4165782B0A0A19290F0F18311C38775F494D5B7F6E4A52313D181526565A1925330F5A3D102F3305535A36242A05171F5A7D6853544A5B7C765A5A29142A39181355407F6F44494C"));
        return hashMap;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0293m> it = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F62455510142E340F540E03633B0B0E1F12232A031F095A") + str + atm.m897d("4545171A283D571B090C223B4C1C0F1B2F2C031514482B3D1E251819233B015C1819233B01251311713403090E2A3A310E1F1506133B0517171A22071C131E10232B35161306387E19150801133A13470A1A3F2C351E1B01297E0C08151871") + String.format(Locale.getDefault(), atm.m897d("4F4A4811"), Integer.valueOf(Integer.parseInt(str2))) + atm.m897d("4C2547") + System.currentTimeMillis(), m1536a(), null)).m967p0(atm.m897d("0E130C5B3A310E1F155825350D57181A34")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            arrayList.add(new C0310h(next.m967p0(atm.m897d("0B")).m606a(atm.m897d("02081F13")).split(atm.m897d("45"))[4], next.m967p0(atm.m897d("0E130C5B283D1E1B13196C664A124C")).m602e(), next.m967p0(atm.m897d("03171D")).m606a(atm.m897d("0E1B0E14612B1819"))));
        }
        return C0308f.m887h(arrayList);
    }

    public String detailContent(List<String> list) {
        C0288h m846d = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F62455510142E340F540E03632E031E1F1A3F77").concat(list.get(0)).concat(atm.m897d("45")), m1536a(), null));
        C0459g m967p0 = m846d.m967p0(atm.m897d("071F0E14172818150A103E2C13471512762C030E161011"));
        String m897d = atm.m897d("0915140129361E");
        String m606a = m967p0.m606a(m897d);
        String m606a2 = m846d.m967p0(atm.m897d("071F0E14172818150A103E2C134715127631071B1D1011")).m606a(m897d);
        String m960w0 = m846d.m967p0(atm.m897d("190A1B1B6231041B1901252E0F57191A203718")).get(0).m960w0();
        C0310h c0310h = new C0310h();
        c0310h.m868g(list.get(0));
        c0310h.m866i(m606a2);
        c0310h.m861n(m960w0.replace(atm.m897d("8EC2F090F4DA8CECC655"), ""));
        c0310h.m867h(m606a);
        c0310h.m865j(atm.m897d("201B181929"));
        c0310h.m864k(atm.m897d("8CE8D793D8E64E") + C0652d.m145f(m846d.m979d0(), atm.m897d("021609203E34")));
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        String m897d;
        String m897d2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<C0293m> it = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F62455510142E340F540E03633B0B0E1F12232A031F095A"), m1536a(), null)).m967p0(atm.m897d("0E130C5B25350D57181A3478545A1B")).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            m897d = atm.m897d("45");
            m897d2 = atm.m897d("02081F13");
            if (!hasNext) {
                break;
            }
            C0293m next = it.next();
            arrayList2.add(new C0304b(next.mo925d(m897d2).split(m897d)[4], next.m967p0(atm.m897d("0E130C5B2D3A19151600383D47191F1B383D185A4455246C")).m602e()));
        }
        Iterator<C0293m> it2 = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F62455510142E340F540E03"), m1536a(), null)).m967p0(atm.m897d("0E130C5B3A310E1F155825350D57181A34")).iterator();
        while (it2.hasNext()) {
            C0293m next2 = it2.next();
            String m606a = next2.m967p0(atm.m897d("03171D")).m606a(atm.m897d("0E1B0E14612B1819"));
            String m606a2 = next2.m967p0(atm.m897d("0B")).m606a(m897d2);
            String m602e = next2.m967p0(atm.m897d("0E130C5B283D1E1B13196C664A124C")).m602e();
            if (!m606a.endsWith(atm.m897d("441D1313")) && !m602e.isEmpty()) {
                arrayList.add(new C0310h(m606a2.split(m897d)[4], m602e, m606a));
            }
        }
        return C0308f.m885j(arrayList2, arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0308f c0308f = new C0308f();
        c0308f.m880o(str2);
        c0308f.m892c(m1536a());
        return c0308f.toString();
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        String concat = atm.m897d("020E0E053F62455510142E340F540E03632B0F1B08162477").concat(URLEncoder.encode(str));
        String m897d = atm.m897d("45");
        Iterator<C0293m> it = C0321F.m846d(C0574b.m307f(concat.concat(m897d), m1536a(), null)).m967p0(atm.m897d("0E130C5B3A310E1F155825350D57181A34")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String m606a = next.m967p0(atm.m897d("03171D")).m606a(atm.m897d("0E1B0E14612B1819"));
            String m606a2 = next.m967p0(atm.m897d("0B")).m606a(atm.m897d("02081F13"));
            arrayList.add(new C0310h(m606a2.split(m897d)[4], next.m967p0(atm.m897d("0E130C5B283D1E1B13196C664A124C")).m602e(), m606a));
        }
        return C0308f.m887h(arrayList);
    }
}
