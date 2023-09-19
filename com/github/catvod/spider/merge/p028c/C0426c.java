package com.github.catvod.spider.merge.p028c;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.util.Comparator;

/* renamed from: com.github.catvod.spider.merge.c.c */
/* loaded from: classes.dex */
public final class C0426c implements Comparator<C0425b> {
    /* renamed from: a */
    private int m625a(String str) {
        return Integer.parseInt(C0652d.m140k(str).replace(atm.m897d("5B4A42451C"), "").replace(atm.m897d("5E31"), "").replaceAll(atm.m897d("363E51"), ""));
    }

    @Override // java.util.Comparator
    public final int compare(C0425b c0425b, C0425b c0425b2) {
        C0425b c0425b3 = c0425b;
        C0425b c0425b4 = c0425b2;
        try {
            int m625a = m625a(c0425b3.m633b());
            int m625a2 = m625a(c0425b4.m633b());
            if (m625a == m625a2) {
                return 0;
            }
            return m625a < m625a2 ? -1 : 1;
        } catch (NumberFormatException unused) {
            return c0425b3.m633b().compareToIgnoreCase(c0425b4.m633b());
        }
    }
}
