package com.github.catvod.spider.merge.p040i;

import com.github.catvod.spider.merge.p026b.C0310h;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.i.c */
/* loaded from: classes.dex */
public final class C0564c {
    @SerializedName("list")

    /* renamed from: a */
    private List<C0563b> f1035a;

    /* renamed from: a */
    public final List<C0310h> m317a(String str) {
        ArrayList arrayList = new ArrayList();
        List<C0563b> list = this.f1035a;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f1035a = list;
        for (C0563b c0563b : list) {
            if (c0563b.m319a().contains(str)) {
                arrayList.add(c0563b.m318b());
            }
        }
        return arrayList;
    }
}
