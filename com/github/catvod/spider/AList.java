package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.AList;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0304b;
import com.github.catvod.spider.merge.p026b.C0305c;
import com.github.catvod.spider.merge.p026b.C0306d;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0309g;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p030d.C0479a;
import com.github.catvod.spider.merge.p030d.C0481c;
import com.github.catvod.spider.merge.p030d.C0482d;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p055q.C0652d;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AList extends Spider {

    /* renamed from: a */
    private List<C0479a> f0a;

    /* renamed from: b */
    private String f1b;

    /* renamed from: c */
    private String f2c;

    /* renamed from: a */
    public static void m1567a(AList aList, CountDownLatch countDownLatch, List list, C0479a c0479a, String str) {
        aList.getClass();
        c0479a.m598a();
        try {
            for (C0481c c0481c : C0481c.m588a(aList.m1562f(c0479a.m591h(), C0574b.m309d(c0479a.m589j(), c0479a.m590i(str), null).m302a()))) {
                if (!c0481c.m579j(c0479a.m591h())) {
                    list.add(c0481c.m582g(c0479a, aList.f1b));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    /* renamed from: b */
    private void m1566b() {
        List<C0479a> list = this.f0a;
        if (list == null || list.isEmpty()) {
            if (this.f2c.startsWith(atm.m897d("020E0E05"))) {
                this.f2c = C0574b.m307f(this.f2c, null, null);
            }
            C0479a c0479a = (C0479a) new Gson().fromJson(this.f2c, C0479a.class);
            this.f0a = c0479a.m597b();
            this.f1b = c0479a.m592g();
        }
    }

    /* renamed from: c */
    private C0481c m1565c(String str) {
        String m897d = atm.m897d("45");
        try {
            String substring = str.contains(m897d) ? str.substring(0, str.indexOf(m897d)) : str;
            String substring2 = str.contains(m897d) ? str.substring(str.indexOf(m897d)) : "";
            C0479a m1564d = m1564d(substring);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(atm.m897d("1A1B09063B37181E"), m1564d.m594e());
            String m897d2 = atm.m897d("1A1B0E1D");
            if (!substring2.startsWith(m1564d.m593f())) {
                substring2 = m1564d.m593f() + substring2;
            }
            jSONObject.put(m897d2, substring2);
            StringBuilder sb = new StringBuilder();
            sb.append(m1564d.m596c());
            sb.append(m1564d.m591h() ? atm.m897d("451B0A1C633E19551D1038") : atm.m897d("451B0A1C63281F18161C2F771A1B0E1D"));
            String m302a = C0574b.m309d(sb.toString(), jSONObject.toString(), null).m302a();
            boolean m591h = m1564d.m591h();
            String m897d3 = atm.m897d("0E1B0E14");
            return (C0481c) new Gson().fromJson((m591h ? new JSONObject(m302a).getJSONObject(m897d3) : new JSONObject(m302a).getJSONObject(m897d3).getJSONArray(atm.m897d("0C1316103F")).getJSONObject(0)).toString(), C0481c.class);
        } catch (Exception unused) {
            return new C0481c();
        }
    }

    /* renamed from: d */
    private C0479a m1564d(String str) {
        List<C0479a> list = this.f0a;
        C0479a c0479a = list.get(list.indexOf(new C0479a(str)));
        c0479a.m598a();
        return c0479a;
    }

    /* renamed from: e */
    private List<C0481c> m1563e(String str, boolean z) {
        JSONObject jSONObject;
        String m897d;
        String m897d2 = atm.m897d("45");
        try {
            String substring = str.contains(m897d2) ? str.substring(0, str.indexOf(m897d2)) : str;
            String substring2 = str.contains(m897d2) ? str.substring(str.indexOf(m897d2)) : "";
            C0479a m1564d = m1564d(substring);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(atm.m897d("1A1B09063B37181E"), m1564d.m594e());
            String m897d3 = atm.m897d("1A1B0E1D");
            if (!substring2.startsWith(m1564d.m593f())) {
                substring2 = m1564d.m593f() + substring2;
            }
            jSONObject2.put(m897d3, substring2);
            StringBuilder sb = new StringBuilder();
            sb.append(m1564d.m596c());
            sb.append(m1564d.m591h() ? atm.m897d("451B0A1C633E1955161C3F2C") : atm.m897d("451B0A1C63281F18161C2F771A1B0E1D"));
            String m302a = C0574b.m309d(sb.toString(), jSONObject2.toString(), null).m302a();
            boolean m591h = m1564d.m591h();
            String m897d4 = atm.m897d("0E1B0E14");
            if (m591h) {
                jSONObject = new JSONObject(m302a).getJSONObject(m897d4);
                m897d = atm.m897d("0915140129361E");
            } else {
                jSONObject = new JSONObject(m302a).getJSONObject(m897d4);
                m897d = atm.m897d("0C1316103F");
            }
            List<C0481c> m588a = C0481c.m588a(jSONObject.getJSONArray(m897d).toString());
            Iterator<C0481c> it = m588a.iterator();
            if (z) {
                while (it.hasNext()) {
                    if (it.next().m579j(m1564d.m591h())) {
                        it.remove();
                    }
                }
            }
            return m588a;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: f */
    private String m1562f(boolean z, String str) {
        String m897d = atm.m897d("0E1B0E14");
        return (z ? new JSONObject(str).getJSONObject(m897d).getJSONArray(atm.m897d("0915140129361E")) : new JSONObject(str).getJSONArray(m897d)).toString();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        m1566b();
        String m897d = atm.m897d("1E030A10");
        String str3 = hashMap.containsKey(m897d) ? hashMap.get(m897d) : "";
        String m897d2 = atm.m897d("05081E103E");
        String str4 = hashMap.containsKey(m897d2) ? hashMap.get(m897d2) : "";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C0481c c0481c : m1563e(str, true)) {
            if (c0481c.m578k()) {
                arrayList.add(c0481c);
            } else {
                arrayList2.add(c0481c);
            }
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            C0482d.m576a(str3, str4, arrayList);
            C0482d.m576a(str3, str4, arrayList2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C0481c) it.next()).m581h(str, this.f1b));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C0481c) it2.next()).m581h(str, this.f1b));
        }
        C0308f c0308f = new C0308f();
        c0308f.m879p(arrayList3);
        c0308f.m890e();
        return c0308f.toString();
    }

    public String detailContent(List<String> list) {
        m1566b();
        String str = list.get(0);
        String m897d = atm.m897d("45");
        String substring = str.contains(m897d) ? str.substring(0, str.indexOf(m897d)) : str;
        String substring2 = str.substring(0, str.lastIndexOf(m897d));
        String substring3 = substring2.substring(substring2.lastIndexOf(m897d) + 1);
        C0479a m1564d = m1564d(substring);
        List<C0481c> m1563e = m1563e(substring2, false);
        C0482d.m576a(atm.m897d("041B1710"), atm.m897d("0B0919"), m1563e);
        ArrayList arrayList = new ArrayList();
        for (C0481c c0481c : m1563e) {
            if (c0481c.m577l(m1564d.m591h())) {
                StringBuilder sb = new StringBuilder();
                sb.append(c0481c.m586c());
                sb.append(atm.m897d("4E"));
                sb.append(c0481c.m580i(substring2));
                StringBuilder sb2 = new StringBuilder();
                for (C0481c c0481c2 : m1563e) {
                    if (C0652d.m144g(C0652d.m147d(c0481c2.m586c()))) {
                        sb2.append(atm.m897d("140404"));
                        sb2.append(c0481c2.m586c());
                        String m897d2 = atm.m897d("2A3A3A");
                        sb2.append(m897d2);
                        sb2.append(C0652d.m147d(c0481c2.m586c()));
                        sb2.append(m897d2);
                        sb2.append(c0481c2.m580i(substring2));
                    }
                }
                sb.append(sb2.toString());
                arrayList.add(sb.toString());
            }
        }
        C0310h c0310h = new C0310h();
        c0310h.m868g(str);
        c0310h.m867h(substring3);
        c0310h.m866i(this.f1b);
        c0310h.m865j(substring);
        c0310h.m864k(TextUtils.join(atm.m897d("49"), arrayList));
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        m1566b();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C0479a c0479a : this.f0a) {
            arrayList.add(new C0304b(c0479a.m595d(), c0479a.m595d(), atm.m897d("5B")));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String m895b = ((C0304b) it.next()).m895b();
            ArrayList arrayList2 = new ArrayList();
            String m897d = atm.m897d("83DAEA9DE4F5");
            arrayList2.add(new C0306d(atm.m897d("1E030A10"), atm.m897d("8CF4E890F6D783DBE490D2D3"), Arrays.asList(new C0305c(m897d, ""), new C0305c(atm.m897d("8FEAF792E4E9"), atm.m897d("041B1710")), new C0305c(atm.m897d("8FDEDD90FCD7"), atm.m897d("19130010")), new C0305c(atm.m897d("8EC5D493D8E18CE3F89CDACB"), atm.m897d("0E1B0E10")))));
            arrayList2.add(new C0306d(atm.m897d("05081E103E"), atm.m897d("8CF4E890F6D78CECC390F0D7"), Arrays.asList(new C0305c(m897d, ""), new C0305c(atm.m897d("88D6FC"), atm.m897d("0B0919")), new C0305c(atm.m897d("88D6FD"), atm.m897d("0E1F0916")))));
            linkedHashMap.put(m895b, arrayList2);
        }
        return C0308f.m886i(arrayList, linkedHashMap);
    }

    public void init(Context context, String str) {
        try {
            this.f2c = str;
            m1566b();
        } catch (Exception unused) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] split = str2.split(atm.m897d("140404"));
        C0308f c0308f = new C0308f();
        c0308f.m880o(m1565c(split[0]).m583f());
        ArrayList arrayList = new ArrayList();
        for (String str3 : split) {
            String m897d = atm.m897d("2A3A3A");
            if (str3.contains(m897d)) {
                String[] split2 = str3.split(m897d);
                String str4 = split2[0];
                String str5 = split2[1];
                String m583f = m1565c(split2[2]).m583f();
                C0309g c0309g = new C0309g();
                c0309g.m876c(str4);
                C0309g m878a = c0309g.m878a(str5);
                m878a.m875d(m583f);
                arrayList.add(m878a);
            }
        }
        c0308f.m881n(arrayList);
        return c0308f.toString();
    }

    public String searchContent(final String str, boolean z) {
        m1566b();
        final ArrayList arrayList = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(this.f0a.size());
        for (final C0479a c0479a : this.f0a) {
            new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.p.a
                @Override // java.lang.Runnable
                public final void run() {
                    AList.m1567a(AList.this, countDownLatch, arrayList, c0479a, str);
                }
            }).start();
        }
        countDownLatch.await();
        return C0308f.m887h(arrayList);
    }
}
