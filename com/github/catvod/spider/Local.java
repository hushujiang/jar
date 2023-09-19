package com.github.catvod.spider;

import android.content.Context;
import android.os.Environment;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0304b;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0309g;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class Local extends Spider {

    /* renamed from: a */
    private SimpleDateFormat f23a;

    /* renamed from: a */
    private C0310h m1535a(File file) {
        C0310h c0310h = new C0310h();
        c0310h.m868g(file.getAbsolutePath());
        c0310h.m867h(file.getName());
        c0310h.m866i(file.isDirectory() ? atm.m897d("020E0E053F62455509446239124B025B2F37075548457E6B454A4F5A7C6C450A43012B11524B5405223F") : atm.m897d("020E0E053F62455509446239124B025B2F37075548457E6B454A4F5A7C6C450A43012B370D025405223F"));
        c0310h.m863l(this.f23a.format(Long.valueOf(file.lastModified())));
        c0310h.m862m(file.isDirectory() ? atm.m897d("0C151611292A") : atm.m897d("0C131610"));
        return c0310h;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return C0308f.m887h(arrayList);
        }
        Arrays.sort(listFiles, new Comparator() { // from class: com.github.catvod.spider.merge.p.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((File) obj).getName().compareTo(((File) obj2).getName());
            }
        });
        for (File file : listFiles) {
            if (!file.getName().startsWith(atm.m897d("44"))) {
                if (file.isDirectory()) {
                    arrayList3.add(m1535a(file));
                } else if (C0652d.f1245a.contains(C0652d.m147d(file.getName()))) {
                    arrayList2.add(m1535a(file));
                }
            }
        }
        arrayList.addAll(arrayList3);
        arrayList.addAll(arrayList2);
        return C0308f.m887h(arrayList);
    }

    public String detailContent(List<String> list) {
        File file = new File(list.get(0));
        C0310h c0310h = new C0310h();
        c0310h.m873b(atm.m897d("2C1514120131"));
        c0310h.m868g(file.getAbsolutePath());
        c0310h.m867h(file.getName());
        c0310h.m866i(atm.m897d("020E0E053F62455509446239124B025B2F37075548457E6B454A4F5A7C6C450A43012B370D025405223F"));
        c0310h.m865j(atm.m897d("8CE8D793D8E6"));
        c0310h.m864k(file.getName() + atm.m897d("4E") + file.getAbsolutePath());
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        String m897d = atm.m897d("8CE6D690D0E88CECFD91F7EE");
        String m897d2 = atm.m897d("5B");
        arrayList2.add(new C0304b(absolutePath, m897d, m897d2));
        File[] listFiles = new File(atm.m897d("45090E1A3E390D1F")).listFiles();
        if (listFiles == null) {
            arrayList = new ArrayList();
        } else {
            List asList = Arrays.asList(atm.m897d("0F170F192D2C0F1E"), atm.m897d("191E19143E3C"), atm.m897d("191F1613"));
            for (File file : listFiles) {
                if (!asList.contains(file.getName())) {
                    arrayList2.add(new C0304b(file.getAbsolutePath(), file.getName(), m897d2));
                }
            }
            arrayList = new ArrayList();
        }
        return C0308f.m885j(arrayList2, arrayList);
    }

    public void init(Context context, String str) {
        this.f23a = new SimpleDateFormat(atm.m897d("1303030C35772737551128782232401821621909"), Locale.getDefault());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.github.catvod.spider.merge.b.f] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    public String playerContent(String str, String str2, List<String> list) {
        ?? arrayList;
        ?? c0308f = new C0308f();
        c0308f.m880o(str2);
        File file = new File(str2);
        if (file.getParentFile() == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            File[] listFiles = file.getParentFile().listFiles();
            listFiles.getClass();
            for (File file2 : listFiles) {
                String m147d = C0652d.m147d(file2.getName());
                if (C0652d.m144g(m147d)) {
                    C0309g c0309g = new C0309g();
                    c0309g.m876c(C0652d.m140k(file2.getName()));
                    C0309g m878a = c0309g.m878a(m147d);
                    StringBuilder m635a = C0424a.m635a(atm.m897d("0C131610767745"));
                    m635a.append(file2.getAbsolutePath());
                    m878a.m875d(m635a.toString());
                    arrayList.add(m878a);
                }
            }
        }
        c0308f.m881n(arrayList);
        return c0308f.toString();
    }
}
