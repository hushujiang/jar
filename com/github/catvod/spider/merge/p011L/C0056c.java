package com.github.catvod.spider.merge.p011L;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.L.c */
/* loaded from: classes.dex */
public final class C0056c extends C0054a {
    static {
        new C0056c(1, 0);
    }

    public C0056c(int i, int i2) {
        super(i, i2, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0056c) {
            if (!isEmpty() || !((C0056c) obj).isEmpty()) {
                C0056c c0056c = (C0056c) obj;
                if (m1403a() != c0056c.m1403a() || m1402b() != c0056c.m1402b()) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m1403a() * 31) + m1402b();
    }

    public final boolean isEmpty() {
        return m1403a() > m1402b();
    }

    public final String toString() {
        return m1403a() + atm.m897d("4454") + m1402b();
    }
}
