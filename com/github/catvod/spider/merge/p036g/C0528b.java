package com.github.catvod.spider.merge.p036g;

import com.github.catvod.spider.merge.atm;
import com.thegrizzlylabs.sardineandroid.DavResource;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.g.b */
/* loaded from: classes.dex */
public final class C0528b implements Comparator<DavResource> {

    /* renamed from: a */
    private final String f959a;

    /* renamed from: b */
    private final String f960b;

    public C0528b(String str, String str2) {
        this.f959a = str;
        this.f960b = str2;
    }

    /* renamed from: a */
    public static void m397a(String str, String str2, List<DavResource> list) {
        Collections.sort(list, new C0528b(str, str2));
    }

    @Override // java.util.Comparator
    public final int compare(DavResource davResource, DavResource davResource2) {
        char c;
        int compareTo;
        long longValue;
        Long contentLength;
        DavResource davResource3 = davResource;
        DavResource davResource4 = davResource2;
        boolean equals = this.f960b.equals(atm.m897d("0B0919"));
        String str = this.f959a;
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode == 3076014) {
            if (str.equals(atm.m897d("0E1B0E10"))) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3373707) {
            if (hashCode == 3530753 && str.equals(atm.m897d("19130010"))) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals(atm.m897d("041B1710"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            compareTo = equals ? davResource3.getModified().compareTo(davResource4.getModified()) : davResource4.getModified().compareTo(davResource3.getModified());
        } else if (c != 1) {
            if (c != 2) {
                return -1;
            }
            if (equals) {
                longValue = davResource3.getContentLength().longValue();
                contentLength = davResource4.getContentLength();
            } else {
                longValue = davResource4.getContentLength().longValue();
                contentLength = davResource3.getContentLength();
            }
            return (longValue > contentLength.longValue() ? 1 : (longValue == contentLength.longValue() ? 0 : -1));
        } else {
            compareTo = equals ? davResource3.getName().compareTo(davResource4.getName()) : davResource4.getName().compareTo(davResource3.getName());
        }
        return compareTo;
    }
}
