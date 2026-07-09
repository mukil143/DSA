/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {
    intervals.sort((a,b)=>a[0]-b[0]);//sort the intervals based the starting time
    const res=[intervals[0]];//[1,3]
    for(let i=1;i<intervals.length;i++){
        let current=intervals[i];//[2,6]
        let lastmerge=res[res.length-1]//1-1=0 // [1,3]
        
        if(current[0] <= lastmerge[1]){
            lastmerge[1] = Math.max(lastmerge[1],current[1]);//3,6  =6 [1,6]   
        }else{
            res.push(current);
        }
    }
    return res;
};