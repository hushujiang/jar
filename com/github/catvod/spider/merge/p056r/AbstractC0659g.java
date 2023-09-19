package com.github.catvod.spider.merge.p056r;

/* renamed from: com.github.catvod.spider.merge.r.g */
/* loaded from: classes.dex */
public abstract class AbstractC0659g {
    /* renamed from: a */
    public int mo137a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C0665m.m126f(i, length);
        while (i < length) {
            if (mo136b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public abstract boolean mo136b(char c);
}
