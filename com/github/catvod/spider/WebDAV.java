package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0304b;
import com.github.catvod.spider.merge.p026b.C0305c;
import com.github.catvod.spider.merge.p026b.C0306d;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0309g;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p036g.C0527a;
import com.github.catvod.spider.merge.p036g.C0528b;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p055q.C0652d;
import com.google.gson.Gson;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class WebDAV extends Spider {

    /* renamed from: c */
    private static List<C0527a> f26c;

    /* renamed from: a */
    private List<String> f27a;

    /* renamed from: b */
    private String f28b;

    /* renamed from: a */
    private void m1530a() {
        List<C0527a> list = f26c;
        if (list == null || list.isEmpty()) {
            if (this.f28b.startsWith(atm.m897d("020E0E05"))) {
                this.f28b = C0574b.m307f(this.f28b, null, null);
            }
            f26c = ((C0527a) new Gson().fromJson(this.f28b, C0527a.class)).m403a();
        }
    }

    /* renamed from: b */
    private static C0527a m1529b(String str) {
        List<C0527a> list = f26c;
        return list.get(list.indexOf(new C0527a(str)));
    }

    /* renamed from: c */
    private String m1528c(DavResource davResource) {
        return C0652d.m147d(davResource.getName());
    }

    /* renamed from: d */
    private List<DavResource> m1527d(C0527a c0527a, String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(c0527a.m402b());
        if (!str.startsWith(c0527a.m400d())) {
            str = c0527a.m400d() + str;
        }
        sb.append(str);
        List<DavResource> list2 = c0527a.m399e().list(sb.toString());
        list2.remove(0);
        Iterator<DavResource> it = list2.iterator();
        while (it.hasNext()) {
            DavResource next = it.next();
            if (!next.isDirectory() && !next.getName().contains(atm.m897d("44"))) {
                it.remove();
            }
            if (!next.isDirectory() && !list.contains(C0652d.m147d(next.getName()))) {
                it.remove();
            }
        }
        return list2;
    }

    /* renamed from: e */
    private String m1526e(String str) {
        return Proxy.getUrl() + atm.m897d("551E15483B3D081E1B036A2D181647") + str;
    }

    public static Object[] vod(Map<String, String> map) {
        String str = map.get(atm.m897d("1F0816"));
        String m897d = atm.m897d("45");
        String substring = str.contains(m897d) ? str.substring(0, str.indexOf(m897d)) : str;
        String substring2 = str.substring(substring.length());
        C0527a m1529b = m1529b(substring);
        Sardine m399e = m1529b.m399e();
        return new Object[]{200, atm.m897d("0B0A0A19253B0B0E131A227705190E103875190E08102D35"), m399e.get(m1529b.m402b() + substring2)};
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String m897d = atm.m897d("45");
        String substring = str.contains(m897d) ? str.substring(0, str.indexOf(m897d)) : str;
        String substring2 = str.contains(m897d) ? str.substring(str.indexOf(m897d)) : "";
        String m897d2 = atm.m897d("05081E103E");
        String str3 = hashMap.containsKey(m897d2) ? hashMap.get(m897d2) : "";
        String m897d3 = atm.m897d("1E030A10");
        String str4 = hashMap.containsKey(m897d3) ? hashMap.get(m897d3) : "";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C0527a m1529b = m1529b(substring);
        for (DavResource davResource : m1527d(m1529b, substring2, C0652d.f1245a)) {
            if (davResource.isDirectory()) {
                arrayList.add(davResource);
            } else {
                arrayList2.add(davResource);
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            C0528b.m397a(str4, str3, arrayList);
            C0528b.m397a(str4, str3, arrayList2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(m1529b.m398f((DavResource) it.next(), atm.m897d("020E0E053F62455509446239124B025B2F37075548457E6B454A4F5A7C6C450A43012B11524B5405223F")));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(m1529b.m398f((DavResource) it2.next(), atm.m897d("020E0E053F62455509446239124B025B2F37075548457E6B454A4F5A7C6C450A43012B370D025405223F")));
        }
        C0308f c0308f = new C0308f();
        c0308f.m879p(arrayList3);
        c0308f.m890e();
        return c0308f.toString();
    }

    public String detailContent(List<String> list) {
        String m897d;
        String m897d2;
        String sb;
        String str = list.get(0);
        String m897d3 = atm.m897d("45");
        String substring = str.contains(m897d3) ? str.substring(0, str.indexOf(m897d3)) : str;
        String substring2 = str.substring(0, str.lastIndexOf(m897d3));
        String str2 = substring2.contains(m897d3) ? substring2.substring(substring2.indexOf(m897d3)) + m897d3 : "";
        String substring3 = substring2.substring(substring2.lastIndexOf(m897d3) + 1);
        C0527a m1529b = m1529b(substring);
        List<DavResource> m1527d = m1527d(m1529b, str2, this.f27a);
        ArrayList arrayList = new ArrayList();
        for (DavResource davResource : m1527d) {
            if (C0652d.m144g(m1528c(davResource))) {
                arrayList.add(davResource);
            }
        }
        C0528b.m397a(atm.m897d("041B1710"), atm.m897d("0B0919"), m1527d);
        ArrayList arrayList2 = new ArrayList();
        for (DavResource davResource2 : m1527d) {
            if (C0652d.f1245a.contains(m1528c(davResource2))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(davResource2.getName());
                sb2.append(atm.m897d("4E"));
                sb2.append(m1529b.m401c());
                sb2.append(davResource2.getPath());
                StringBuilder sb3 = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    m897d = atm.m897d("140404");
                    m897d2 = atm.m897d("2A3A3A");
                    if (!hasNext) {
                        break;
                    }
                    DavResource davResource3 = (DavResource) it.next();
                    if (C0652d.m140k(davResource3.getName()).equals(C0652d.m140k(davResource2.getName()))) {
                        sb3.append(m897d);
                        sb3.append(davResource3.getName());
                        sb3.append(m897d2);
                        sb3.append(C0652d.m147d(davResource3.getName()));
                        sb3.append(m897d2);
                        sb3.append(m1529b.m401c() + davResource3.getPath());
                    }
                }
                if (sb3.length() > 0) {
                    sb = sb3.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        DavResource davResource4 = (DavResource) it2.next();
                        sb4.append(m897d);
                        sb4.append(davResource4.getName());
                        sb4.append(m897d2);
                        sb4.append(C0652d.m147d(davResource4.getName()));
                        sb4.append(m897d2);
                        sb4.append(m1529b.m401c() + davResource4.getPath());
                    }
                    sb = sb4.toString();
                }
                sb2.append(sb);
                arrayList2.add(sb2.toString());
            }
        }
        C0310h c0310h = new C0310h();
        c0310h.m868g(substring3);
        c0310h.m867h(substring3);
        c0310h.m865j(substring);
        c0310h.m866i(atm.m897d("020E0E053F62455509446239124B025B2F37075548457E6B454A4F5A7C6C450A43012B370D025405223F"));
        c0310h.m864k(TextUtils.join(atm.m897d("49"), arrayList2));
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        m1530a();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C0527a c0527a : f26c) {
            arrayList.add(new C0304b(c0527a.m401c(), c0527a.m401c(), atm.m897d("5B")));
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
        ArrayList arrayList = new ArrayList(Arrays.asList(atm.m897d("0B0909"), atm.m897d("19091B"), atm.m897d("19080E")));
        this.f27a = arrayList;
        arrayList.addAll(C0652d.f1245a);
        this.f28b = str;
        m1530a();
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] split = str2.split(atm.m897d("140404"));
        C0308f c0308f = new C0308f();
        c0308f.m880o(m1526e(split[0]));
        ArrayList arrayList = new ArrayList();
        for (String str3 : split) {
            String m897d = atm.m897d("2A3A3A");
            if (str3.contains(m897d)) {
                String[] split2 = str3.split(m897d);
                String str4 = split2[0];
                String str5 = split2[1];
                String m1526e = m1526e(split2[2]);
                C0309g c0309g = new C0309g();
                c0309g.m876c(str4);
                C0309g m878a = c0309g.m878a(str5);
                m878a.m875d(m1526e);
                arrayList.add(m878a);
            }
        }
        c0308f.m881n(arrayList);
        return c0308f.toString();
    }
}
