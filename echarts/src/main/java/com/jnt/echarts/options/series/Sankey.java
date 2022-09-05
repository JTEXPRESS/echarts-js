package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.SeriesType;
import com.jnt.echarts.options.series.force.Link;
import com.jnt.echarts.options.series.force.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class Sankey extends Series<Sankey> {
    private List nodes;
    private List<Link> links;
    private List<Link> edges;
    private Integer nodeWidth;
    private Integer nodeGap;
    private Integer layoutIterations;

    public Sankey() { this.type(SeriesType.sankey); }

    public Sankey(String name) {
        super(name);
        this.type(SeriesType.sankey);
    }

    public Sankey nodes(List nodes) {
        this.nodes = nodes;
        return this;
    }

    public Sankey links(List<Link> links) {
        this.links = links;
        return this;
    }

    public Sankey edges(List<Link> edges) {
        this.edges = edges;
        return this;
    }

    public List<Node> nodes() {
        if (this.nodes == null) this.nodes = new ArrayList();
        return this.nodes;
    }

    public Sankey nodes(Node... values) {
        if (values == null || values.length == 0) return this;
        this.nodes().addAll(Arrays.asList(values));
        return this;
    }

    public List<Link> links() {
        if (this.links == null) this.links = new ArrayList<>();
        return this.links;
    }

    public Sankey links(Link... values) {
        if (values == null || values.length == 0) return this;
        this.links().addAll(Arrays.asList(values));
        return this;
    }

    public List<Link> edges() {
        if (this.edges == null) this.edges = new ArrayList<>();
        return this.edges;
    }

    public Sankey edges(Link... values) {
        if (values == null || values.length == 0) return this;
        this.edges().addAll(Arrays.asList(values));
        return this;
    }

    public Integer nodeWidth() { return this.nodeWidth; }

    public Sankey nodeWidth(Integer nodeWidth) {
        this.nodeWidth = nodeWidth;
        return this;
    }

    public Integer nodeGap() { return this.nodeGap; }

    public Sankey nodeGap(Integer nodeGap) {
        this.nodeGap = nodeGap;
        return this;
    }

    public Integer layoutIterations() { return this.layoutIterations; }

    public Sankey layoutIterations(Integer layoutIterations) {
        this.layoutIterations = layoutIterations;
        return this;
    }
}
